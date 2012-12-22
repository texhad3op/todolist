package controllers

import anorm._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Task
import models.Task2
import models.Building
import models.Room
import views._

object Application extends Controller {

  val taskForm = Form(
    "label" -> nonEmptyText)

  def index = Action {
    Ok(html.index())
  }

  def tasks = Action {
    Ok(views.html.tasks(Task.all(), taskForm))
  }

  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
      errors => BadRequest(views.html.tasks(Task.all(), errors)),
      label => {
        Task.create(label)
        Redirect(routes.Application.tasks)
      })
  }

  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.Application.tasks)
  }

  ////////////////////////////////////////////////////

  //  val buildingForm = Form(
  //    mapping(
  //      "id" -> ignored(NotAssigned: Pk[Long]),
  //
  //      "name" -> nonEmptyText,
  //      "address" -> nonEmptyText,
  //      "description" -> text)(Building.apply)(Building.unapply)
  //      verifying ("Passwords must match", f => checking99(f.name, f.address)))
  //
  //
  //  def checking99(f1: String, f2: String): Boolean = {
  //    Logger.info("Proverka")
  //    if (f1 == f2) {
  //      Logger.info("passed")
  //      true
  //    } else {
  //      Logger.info("notpassed")
  //      false
  //    }
  //  }

  val taskForm2 = Form(
    mapping("label" -> nonEmptyText, "description" -> nonEmptyText)((label, description) => Task2(0, label, description))((task2: Task2) => Some((task2.label, task2.description))))

  def tasks2 = Action {
    Ok(views.html.tasks2(Task2.all(), taskForm2))
  }

  def newTask2 = Action { implicit request =>
    taskForm2.bindFromRequest.fold(
      errors => BadRequest(views.html.tasks2(Task2.all(), errors)),
      task2 => {
        Task2.create(task2.label, task2.description)
        Redirect(routes.Application.tasks2)
      })
  }
  def deleteTask2(id: Long) = Action {
    Task2.delete(id)
    Redirect(routes.Application.tasks2)
  }
}