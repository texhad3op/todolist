package models

import anorm._
import anorm.SqlParser._
import play.api.db.DB
import play.api.Play.current
import java.util.Date

case class Event(id: Long, registrationDate: Date, name: String, description: String, roomId: Long)

object Event {

  val eventParser = {
    get[Long]("event.id") ~
      get[Date]("event.registrationdate") ~
      get[String]("event.name") ~
      get[String]("event.description") ~
      get[Long]("event.roomid") map {
        case id ~ registrationDate ~ name ~ description ~ roomId => Event(id, registrationDate, name, description, roomId)
      }
  }

  val eventParser2 = {
    get[Long]("eventid") ~
      get[Date]("eventregistrationdate") ~
      get[String]("eventname") ~
      get[String]("eventdescription") ~
      get[Long]("eventroomid") map {
        case id ~ registrationDate ~ name ~ description ~ roomId => Event(id, registrationDate, name, description, roomId)
      }
  }

  def roomEvents(id: Long): List[Event] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          select * from event where roomid = {roomid} order by event.registrationdate desc
        """).on("roomid" -> id).as(eventParser *)
    }
  }
  
    def insert(event: Event, roomId: Long) = {
    DB.withConnection { implicit connection =>
      SQL("insert into event (registrationdate,name,description,roomid) values ({registrationdate},{name},{description},{roomid})").on(
        "registrationdate" -> event.registrationDate,"name" -> event.name,"description"->event.description,"roomid" -> roomId).executeUpdate()
    }
  }
  
}