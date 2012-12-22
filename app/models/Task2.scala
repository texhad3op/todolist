package models

import anorm._
import anorm.SqlParser._
import play.api.db.DB
import play.api.Play.current

case class Task2(id: Long, label: String,description:String)

object Task2 {

  val task2 = {
    get[Long]("id") ~
      get[String]("label")~
      get[String]("description") map {
        case id ~ label ~ description => Task2(id, label, description)
      }
  }

  def all(): List[Task2] = DB.withConnection { implicit c =>
    SQL("select * from task2").as(task2 *)
  }

  def create(label: String, description:String) {
    DB.withConnection { implicit c =>
      SQL("insert into task2 (label,description) values ({label},{description})").on(
        'label -> label,'description -> description).executeUpdate()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from task2 where id = {id}").on(
        'id -> id).executeUpdate()
    }
  }

}