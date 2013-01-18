package controllers

import models.Building
import models.Event
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import play.api._
import views._
import java.util._
import java.lang._
import models.Room
import play.api.libs.json._

object BuildingController extends Controller {
  val buildingForm = Form(
    mapping("name" -> nonEmptyText, "address" -> text, "description" -> text)((name, address, description) => Building(0, name, address, description))((building: Building) => Some((building.name, building.address, building.description))))

  val eventForm = Form(
    mapping("name" -> nonEmptyText, "description" -> nonEmptyText)
    ((name, description) => Event(0, new Date(System.currentTimeMillis), name, description, 0))
    ((event: Event) => Some((event.name, event.description))))

  def buildings = Action {
    Ok(views.html.buildings(Building.all()))
  }

  def createBuilding = Action {
    Ok(views.html.buildingNewForm(buildingForm))
  }

  def saveBuilding = Action { implicit request =>
    buildingForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.buildingNewForm(formWithErrors)),
      building => {
        Building.insert(building)
        Redirect(routes.BuildingController.buildings)
      })
  }

  def deleteBuilding(id: Long) = Action {
    Building.delete(id)
    Redirect(routes.BuildingController.buildings)
  }

  def rooms(buildingId: Long) = Action {
    implicit request =>
      {
        Ok(views.html.rooms(Building.findById(buildingId), Room.roomsAndLastEvent(buildingId))).withSession(
          session + ("buildingId" -> buildingId.toString()))
      }
  }

  val roomForm = Form(
    mapping("number" -> number, "floor" -> number)((number, floor) => Room(0, number, floor, 0))((room: Room) => Some((room.number, room.floor))))

  def createRoom = Action {
    implicit request =>
      session.get("buildingId").map { buildingIdString =>
        val buildingId = buildingIdString.toLong
        Ok(views.html.roomNewForm(roomForm, buildingId))
      }.getOrElse {
        Redirect(routes.BuildingController.buildings)
      }
  }

  def saveRoom = Action {
    implicit request =>
      {
        session.get("buildingId").map { buildingIdString =>
          val buildingId = buildingIdString.toLong
          roomForm.bindFromRequest.fold(
            formWithErrors => BadRequest(views.html.roomNewForm(formWithErrors, buildingId)),
            room => {
              Room.insert(room, buildingId)
              Redirect(routes.BuildingController.rooms(buildingId))
            })
        }.getOrElse {
          Redirect(routes.BuildingController.buildings)
        }
      }
  }

  def all = Action {

    Room.all.map { mm: (Room, Option[Building]) =>
      Logger.info(mm._1.number.toString + "    " + mm._2.map(_.address).getOrElse("null"))
    }

    Ok("kkk")
  }

  def all2 = Action {

    //    Room.all2.map { roomAndBuilding: (Room, Building) =>
    //      Logger.info(roomAndBuilding._1.number.toString + "    " + roomAndBuilding._2.address)
    //    }

    Ok(views.html.roomAndBuilding(Room.all2))
  }

  def roomEvents(roomId: Long) = Action {
    implicit request =>
      {
        Ok(views.html.roomEvents(Event.roomEvents(roomId))).withSession(
          session + ("roomId" -> roomId.toString()))
      }
  }

  def createEvent = Action {
    implicit request =>
      session.get("roomId").map { roomIdString =>
        val roomId = roomIdString.toLong
        Ok(views.html.eventNewForm(eventForm, roomId))
      }.getOrElse {
        Redirect(routes.BuildingController.buildings)
      }
  }

  def saveEvent = Action {
    implicit request =>
      session.get("roomId").map { roomIdString =>
        val roomId = roomIdString.toLong
        eventForm.bindFromRequest.fold(
          formWithErrors => BadRequest(views.html.eventNewForm(formWithErrors, roomId)),
          event => {
            Event.insert(event, roomId)
            Redirect(routes.BuildingController.roomEvents(roomId))
          })
      }.getOrElse {
        Redirect(routes.BuildingController.buildings)
      }
  }

  def jsontest = Action {
    val jsonArray = Json.toJson(Seq(1, 2, 3, 4))
    Ok(jsonArray)
  }

  def sayHello = Action { request =>
    request.body.asXml.map { xml =>
      (xml \\ "name" headOption).map(_.text).map { name =>
        Ok("Hello " + name)
      }.getOrElse {
        BadRequest("Missing parameter [name]")
      }
    }.getOrElse {
      BadRequest("Expecting Xml data")
    }
  }

  def sayHello2 = Action(parse.xml) { request =>
    (request.body \\ "name" headOption).map(_.text).map { name =>
      Ok(<message status="OK">Hello { name }</message>)
    }.getOrElse {
      BadRequest(<message status="KO">Missing parameter [name]</message>)
    }
  }

  def sayHello3 = Action {

    val ids = Array(121, 56, 98, 765, 54)

    //    Ok(ids.foldLeft[String]("")((a,b) => a+"<message status=\"KO\">"+b+"</message>"))

    //Ok(ids.foldLeft[scala.xml.Elem](scala.xml.el)((a,b) => <message status="KO">{b}</message>))
    //        Ok(ids.foldLeft[Option[scala.xml.Elem]](None)((a,b) => a. <message status="KO">{b}</message>))
    //         Ok(ids.foldLeft[scala.xml.Elem](<hhh></hhh>)((a,b) => a. <message status="KO">{b}</message>))  

    Ok(
      <stuff>
        { ids.map(i => <v id={ i.toString }>{ i }</v>) }
      </stuff>)

  }
}