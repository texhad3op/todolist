// @SOURCE:C:/play-2.0.4/samples/scala/todolist/conf/routes
// @HASH:adff2947c4b97b5fac4f2a4e6dd0f449e3754743
// @DATE:Fri Dec 14 22:43:36 EET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_tasks1 = Route("GET", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:10
val controllers_Application_newTask2 = Route("POST", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:11
val controllers_Application_deleteTask3 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:13
val controllers_BuildingController_buildings4 = Route("GET", PathPattern(List(StaticPart("/buildings"))))
                    

// @LINE:14
val controllers_BuildingController_createBuilding5 = Route("GET", PathPattern(List(StaticPart("/createBuilding"))))
                    

// @LINE:15
val controllers_BuildingController_saveBuilding6 = Route("POST", PathPattern(List(StaticPart("/createBuilding"))))
                    

// @LINE:16
val controllers_BuildingController_deleteBuilding7 = Route("POST", PathPattern(List(StaticPart("/buildings/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:18
val controllers_BuildingController_rooms8 = Route("GET", PathPattern(List(StaticPart("/rooms/"),DynamicPart("buildingId", """[^/]+"""))))
                    

// @LINE:19
val controllers_BuildingController_createRoom9 = Route("GET", PathPattern(List(StaticPart("/createRoom"))))
                    

// @LINE:20
val controllers_BuildingController_saveRoom10 = Route("POST", PathPattern(List(StaticPart("/createRoom"))))
                    

// @LINE:21
val controllers_BuildingController_all11 = Route("GET", PathPattern(List(StaticPart("/all"))))
                    

// @LINE:22
val controllers_BuildingController_all212 = Route("GET", PathPattern(List(StaticPart("/all2"))))
                    

// @LINE:24
val controllers_BuildingController_roomEvents13 = Route("GET", PathPattern(List(StaticPart("/roomEvents/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:25
val controllers_BuildingController_createEvent14 = Route("GET", PathPattern(List(StaticPart("/createEvent"))))
                    

// @LINE:26
val controllers_BuildingController_saveEvent15 = Route("POST", PathPattern(List(StaticPart("/createEvent"))))
                    

// @LINE:30
val controllers_Application_tasks216 = Route("GET", PathPattern(List(StaticPart("/tasks2"))))
                    

// @LINE:31
val controllers_Application_newTask217 = Route("POST", PathPattern(List(StaticPart("/tasks2"))))
                    

// @LINE:32
val controllers_Application_deleteTask218 = Route("POST", PathPattern(List(StaticPart("/tasks2/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:34
val controllers_BuildingController_jsontest19 = Route("GET", PathPattern(List(StaticPart("/jsontest"))))
                    

// @LINE:35
val controllers_BuildingController_sayHello20 = Route("GET", PathPattern(List(StaticPart("/sayHello"))))
                    

// @LINE:36
val controllers_BuildingController_sayHello221 = Route("GET", PathPattern(List(StaticPart("/sayHello2"))))
                    

// @LINE:37
val controllers_BuildingController_sayHello322 = Route("GET", PathPattern(List(StaticPart("/sayHello3"))))
                    

// @LINE:41
val controllers_Assets_at23 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/tasks""","""controllers.Application.tasks"""),("""POST""","""/tasks""","""controllers.Application.newTask"""),("""POST""","""/tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""),("""GET""","""/buildings""","""controllers.BuildingController.buildings"""),("""GET""","""/createBuilding""","""controllers.BuildingController.createBuilding"""),("""POST""","""/createBuilding""","""controllers.BuildingController.saveBuilding"""),("""POST""","""/buildings/$id<[^/]+>/delete""","""controllers.BuildingController.deleteBuilding(id:Long)"""),("""GET""","""/rooms/$buildingId<[^/]+>""","""controllers.BuildingController.rooms(buildingId:Long)"""),("""GET""","""/createRoom""","""controllers.BuildingController.createRoom"""),("""POST""","""/createRoom""","""controllers.BuildingController.saveRoom"""),("""GET""","""/all""","""controllers.BuildingController.all"""),("""GET""","""/all2""","""controllers.BuildingController.all2"""),("""GET""","""/roomEvents/$id<[^/]+>""","""controllers.BuildingController.roomEvents(id:Long)"""),("""GET""","""/createEvent""","""controllers.BuildingController.createEvent"""),("""POST""","""/createEvent""","""controllers.BuildingController.saveEvent"""),("""GET""","""/tasks2""","""controllers.Application.tasks2"""),("""POST""","""/tasks2""","""controllers.Application.newTask2"""),("""POST""","""/tasks2/$id<[^/]+>/delete""","""controllers.Application.deleteTask2(id:Long)"""),("""GET""","""/jsontest""","""controllers.BuildingController.jsontest"""),("""GET""","""/sayHello""","""controllers.BuildingController.sayHello"""),("""GET""","""/sayHello2""","""controllers.BuildingController.sayHello2"""),("""GET""","""/sayHello3""","""controllers.BuildingController.sayHello3"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_tasks1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tasks, HandlerDef(this, "controllers.Application", "tasks", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_newTask2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newTask, HandlerDef(this, "controllers.Application", "newTask", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_deleteTask3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_BuildingController_buildings4(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.buildings, HandlerDef(this, "controllers.BuildingController", "buildings", Nil))
   }
}
                    

// @LINE:14
case controllers_BuildingController_createBuilding5(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.createBuilding, HandlerDef(this, "controllers.BuildingController", "createBuilding", Nil))
   }
}
                    

// @LINE:15
case controllers_BuildingController_saveBuilding6(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.saveBuilding, HandlerDef(this, "controllers.BuildingController", "saveBuilding", Nil))
   }
}
                    

// @LINE:16
case controllers_BuildingController_deleteBuilding7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.BuildingController.deleteBuilding(id), HandlerDef(this, "controllers.BuildingController", "deleteBuilding", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_BuildingController_rooms8(params) => {
   call(params.fromPath[Long]("buildingId", None)) { (buildingId) =>
        invokeHandler(_root_.controllers.BuildingController.rooms(buildingId), HandlerDef(this, "controllers.BuildingController", "rooms", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_BuildingController_createRoom9(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.createRoom, HandlerDef(this, "controllers.BuildingController", "createRoom", Nil))
   }
}
                    

// @LINE:20
case controllers_BuildingController_saveRoom10(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.saveRoom, HandlerDef(this, "controllers.BuildingController", "saveRoom", Nil))
   }
}
                    

// @LINE:21
case controllers_BuildingController_all11(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.all, HandlerDef(this, "controllers.BuildingController", "all", Nil))
   }
}
                    

// @LINE:22
case controllers_BuildingController_all212(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.all2, HandlerDef(this, "controllers.BuildingController", "all2", Nil))
   }
}
                    

// @LINE:24
case controllers_BuildingController_roomEvents13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.BuildingController.roomEvents(id), HandlerDef(this, "controllers.BuildingController", "roomEvents", Seq(classOf[Long])))
   }
}
                    

// @LINE:25
case controllers_BuildingController_createEvent14(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.createEvent, HandlerDef(this, "controllers.BuildingController", "createEvent", Nil))
   }
}
                    

// @LINE:26
case controllers_BuildingController_saveEvent15(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.saveEvent, HandlerDef(this, "controllers.BuildingController", "saveEvent", Nil))
   }
}
                    

// @LINE:30
case controllers_Application_tasks216(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tasks2, HandlerDef(this, "controllers.Application", "tasks2", Nil))
   }
}
                    

// @LINE:31
case controllers_Application_newTask217(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newTask2, HandlerDef(this, "controllers.Application", "newTask2", Nil))
   }
}
                    

// @LINE:32
case controllers_Application_deleteTask218(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteTask2(id), HandlerDef(this, "controllers.Application", "deleteTask2", Seq(classOf[Long])))
   }
}
                    

// @LINE:34
case controllers_BuildingController_jsontest19(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.jsontest, HandlerDef(this, "controllers.BuildingController", "jsontest", Nil))
   }
}
                    

// @LINE:35
case controllers_BuildingController_sayHello20(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.sayHello, HandlerDef(this, "controllers.BuildingController", "sayHello", Nil))
   }
}
                    

// @LINE:36
case controllers_BuildingController_sayHello221(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.sayHello2, HandlerDef(this, "controllers.BuildingController", "sayHello2", Nil))
   }
}
                    

// @LINE:37
case controllers_BuildingController_sayHello322(params) => {
   call { 
        invokeHandler(_root_.controllers.BuildingController.sayHello3, HandlerDef(this, "controllers.BuildingController", "sayHello3", Nil))
   }
}
                    

// @LINE:41
case controllers_Assets_at23(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                