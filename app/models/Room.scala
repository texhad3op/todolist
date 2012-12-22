package models

import anorm._
import anorm.SqlParser._
import play.api.db.DB
import play.api.Play.current

case class Room(id: Long, number: Int, floor: Int, buildingId: Long)

object Room {

  val roomParser = {
    get[Long]("room.id") ~
      get[Int]("room.number") ~
      get[Int]("room.floor") ~
      get[Long]("room.buildingId") map {
        case id ~ number ~ floor ~ buildingId => Room(id, number, floor, buildingId)
      }
  }
  /* 
  def all(): List[Room] = DB.withConnection { implicit c =>
    SQL("select * from room").as(room *)
  }
*/
  def allOfBuilding(buildingId: Long): List[Room] = DB.withConnection { implicit c =>
    SQL("select * from room where buildingId = {buildingId}").on(
      'buildingId -> buildingId) as (roomParser *)
  }

  def insert(room: Room, buildingId: Long) = {
    DB.withConnection { implicit connection =>
      SQL("insert into room (number,floor,buildingId) values ({number},{floor},{buildingId})").on(
        'number -> room.number, 'floor -> room.floor, 'buildingId -> buildingId).executeUpdate()
    }
  }

  val withBuilding = roomParser ~ (Building.buildingParser ?) map {
    case room ~ building => (room, building)
  }

  def all: List[(Room, Option[Building])] = {
    DB.withConnection { implicit connection =>

      val all = SQL(
        """
          select * from room 
          left join building on room.buildingId = building.id
        """).as(withBuilding *)

      all
    }
  }

  def all2: List[(Room, Building)] = {
    val withBuilding2 = roomParser ~ Building.buildingParser map {
      case room ~ building => (room, building)
    }

    DB.withConnection { implicit connection =>

      val all2 = SQL(
        """
          select * from room 
          inner join building on room.buildingId = building.id
        """).as(withBuilding2 *)

      all2
    }
  }

  def roomsAndLastEvent(buildingId: Long): List[(Room, Option[Event])] = {

    val roomsAndLastEventParser = roomParser ~ (Event.eventParser2 ?) map {
      case room ~ event => (room, event)
    }
    
        
    
    val events = DB.withConnection { implicit connection =>
      SQL(
          
          
        """
select room.id,room.number,room.floor,room.buildingId,

(select event.id from event where event.roomId = room.id order by event.registrationdate desc limit 1) as eventid,
(select event.registrationdate from event where event.roomId = room.id order by event.registrationdate desc limit 1) as eventregistrationdate,
(select event.name from event where event.roomId = room.id order by event.registrationdate desc limit 1) as eventname,         
(select event.description from event where event.roomId = room.id order by event.registrationdate desc limit 1) as eventdescription,
(select event.roomId from event where event.roomId = room.id order by event.registrationdate desc limit 1) as eventroomId
 

          from room 
          where room.buildingId = {buildingId}
          order by room.floor, room.number
        """).on("buildingId" -> buildingId).as(roomsAndLastEventParser *)

    }
    

    
    
    
    events
  }
}