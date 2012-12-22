package models

import anorm._
import anorm.SqlParser._
import play.api.db.DB
import play.api.Play.current

case class Building(id: Long, name: String, address: String, description: String)

object Building {
  
    val buildingParser = {
    get[Long]("building.id") ~
    get[String]("building.name") ~
    get[String]("building.address") ~    
    get[String]("building.description") map {
      case id~name~address~description => Building(id, name, address, description)
    }
  }
  
  def all(): List[Building] = DB.withConnection { implicit c =>
    SQL("select * from building").as(buildingParser *)
  }

  def insert(building: Building) = {
    DB.withConnection { implicit connection =>
      SQL("insert into building (name,address,description) values ({name},{address},{description})"
      ).on(
        'name -> building.name,'address -> building.address,'description->building.description
      ).executeUpdate()
    }
  }  
  

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from building where id = {id}").on(
        'id -> id).executeUpdate()
    }
  }
  
    def findById(id: Long): Option[Building] = {
    DB.withConnection { implicit connection =>
      SQL("select * from building where id = {id}").on('id -> id).as(Building.buildingParser.singleOpt)
    }
  }
}