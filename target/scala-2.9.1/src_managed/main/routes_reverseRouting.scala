// @SOURCE:C:/play-2.0.4/samples/scala/todolist/conf/routes
// @HASH:adff2947c4b97b5fac4f2a4e6dd0f449e3754743
// @DATE:Fri Dec 14 22:43:36 EET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBuildingController {
    


 
// @LINE:19
def createRoom() = {
   Call("GET", "/createRoom")
}
                                                        
 
// @LINE:13
def buildings() = {
   Call("GET", "/buildings")
}
                                                        
 
// @LINE:20
def saveRoom() = {
   Call("POST", "/createRoom")
}
                                                        
 
// @LINE:36
def sayHello2() = {
   Call("GET", "/sayHello2")
}
                                                        
 
// @LINE:22
def all2() = {
   Call("GET", "/all2")
}
                                                        
 
// @LINE:16
def deleteBuilding(id:Long) = {
   Call("POST", "/buildings/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:37
def sayHello3() = {
   Call("GET", "/sayHello3")
}
                                                        
 
// @LINE:25
def createEvent() = {
   Call("GET", "/createEvent")
}
                                                        
 
// @LINE:14
def createBuilding() = {
   Call("GET", "/createBuilding")
}
                                                        
 
// @LINE:18
def rooms(buildingId:Long) = {
   Call("GET", "/rooms/" + implicitly[PathBindable[Long]].unbind("buildingId", buildingId))
}
                                                        
 
// @LINE:21
def all() = {
   Call("GET", "/all")
}
                                                        
 
// @LINE:35
def sayHello() = {
   Call("GET", "/sayHello")
}
                                                        
 
// @LINE:26
def saveEvent() = {
   Call("POST", "/createEvent")
}
                                                        
 
// @LINE:34
def jsontest() = {
   Call("GET", "/jsontest")
}
                                                        
 
// @LINE:15
def saveBuilding() = {
   Call("POST", "/createBuilding")
}
                                                        
 
// @LINE:24
def roomEvents(id:Long) = {
   Call("GET", "/roomEvents/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def newTask() = {
   Call("POST", "/tasks")
}
                                                        
 
// @LINE:30
def tasks2() = {
   Call("GET", "/tasks2")
}
                                                        
 
// @LINE:11
def deleteTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:31
def newTask2() = {
   Call("POST", "/tasks2")
}
                                                        
 
// @LINE:32
def deleteTask2(id:Long) = {
   Call("POST", "/tasks2/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:9
def tasks() = {
   Call("GET", "/tasks")
}
                                                        

                      
    
}
                            

// @LINE:41
class ReverseAssets {
    


 
// @LINE:41
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBuildingController {
    


 
// @LINE:19
def createRoom = JavascriptReverseRoute(
   "controllers.BuildingController.createRoom",
   """
      function() {
      return _wA({method:"GET", url:"/createRoom"})
      }
   """
)
                                                        
 
// @LINE:13
def buildings = JavascriptReverseRoute(
   "controllers.BuildingController.buildings",
   """
      function() {
      return _wA({method:"GET", url:"/buildings"})
      }
   """
)
                                                        
 
// @LINE:20
def saveRoom = JavascriptReverseRoute(
   "controllers.BuildingController.saveRoom",
   """
      function() {
      return _wA({method:"POST", url:"/createRoom"})
      }
   """
)
                                                        
 
// @LINE:36
def sayHello2 = JavascriptReverseRoute(
   "controllers.BuildingController.sayHello2",
   """
      function() {
      return _wA({method:"GET", url:"/sayHello2"})
      }
   """
)
                                                        
 
// @LINE:22
def all2 = JavascriptReverseRoute(
   "controllers.BuildingController.all2",
   """
      function() {
      return _wA({method:"GET", url:"/all2"})
      }
   """
)
                                                        
 
// @LINE:16
def deleteBuilding = JavascriptReverseRoute(
   "controllers.BuildingController.deleteBuilding",
   """
      function(id) {
      return _wA({method:"POST", url:"/buildings/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:37
def sayHello3 = JavascriptReverseRoute(
   "controllers.BuildingController.sayHello3",
   """
      function() {
      return _wA({method:"GET", url:"/sayHello3"})
      }
   """
)
                                                        
 
// @LINE:25
def createEvent = JavascriptReverseRoute(
   "controllers.BuildingController.createEvent",
   """
      function() {
      return _wA({method:"GET", url:"/createEvent"})
      }
   """
)
                                                        
 
// @LINE:14
def createBuilding = JavascriptReverseRoute(
   "controllers.BuildingController.createBuilding",
   """
      function() {
      return _wA({method:"GET", url:"/createBuilding"})
      }
   """
)
                                                        
 
// @LINE:18
def rooms = JavascriptReverseRoute(
   "controllers.BuildingController.rooms",
   """
      function(buildingId) {
      return _wA({method:"GET", url:"/rooms/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("buildingId", buildingId)})
      }
   """
)
                                                        
 
// @LINE:21
def all = JavascriptReverseRoute(
   "controllers.BuildingController.all",
   """
      function() {
      return _wA({method:"GET", url:"/all"})
      }
   """
)
                                                        
 
// @LINE:35
def sayHello = JavascriptReverseRoute(
   "controllers.BuildingController.sayHello",
   """
      function() {
      return _wA({method:"GET", url:"/sayHello"})
      }
   """
)
                                                        
 
// @LINE:26
def saveEvent = JavascriptReverseRoute(
   "controllers.BuildingController.saveEvent",
   """
      function() {
      return _wA({method:"POST", url:"/createEvent"})
      }
   """
)
                                                        
 
// @LINE:34
def jsontest = JavascriptReverseRoute(
   "controllers.BuildingController.jsontest",
   """
      function() {
      return _wA({method:"GET", url:"/jsontest"})
      }
   """
)
                                                        
 
// @LINE:15
def saveBuilding = JavascriptReverseRoute(
   "controllers.BuildingController.saveBuilding",
   """
      function() {
      return _wA({method:"POST", url:"/createBuilding"})
      }
   """
)
                                                        
 
// @LINE:24
def roomEvents = JavascriptReverseRoute(
   "controllers.BuildingController.roomEvents",
   """
      function(id) {
      return _wA({method:"GET", url:"/roomEvents/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def newTask = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"/tasks"})
      }
   """
)
                                                        
 
// @LINE:30
def tasks2 = JavascriptReverseRoute(
   "controllers.Application.tasks2",
   """
      function() {
      return _wA({method:"GET", url:"/tasks2"})
      }
   """
)
                                                        
 
// @LINE:11
def deleteTask = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:31
def newTask2 = JavascriptReverseRoute(
   "controllers.Application.newTask2",
   """
      function() {
      return _wA({method:"POST", url:"/tasks2"})
      }
   """
)
                                                        
 
// @LINE:32
def deleteTask2 = JavascriptReverseRoute(
   "controllers.Application.deleteTask2",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:9
def tasks = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"/tasks"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:41
class ReverseAssets {
    


 
// @LINE:41
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBuildingController {
    


 
// @LINE:19
def createRoom() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.createRoom(), HandlerDef(this, "controllers.BuildingController", "createRoom", Seq())
)
                              
 
// @LINE:13
def buildings() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.buildings(), HandlerDef(this, "controllers.BuildingController", "buildings", Seq())
)
                              
 
// @LINE:20
def saveRoom() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.saveRoom(), HandlerDef(this, "controllers.BuildingController", "saveRoom", Seq())
)
                              
 
// @LINE:36
def sayHello2() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.sayHello2(), HandlerDef(this, "controllers.BuildingController", "sayHello2", Seq())
)
                              
 
// @LINE:22
def all2() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.all2(), HandlerDef(this, "controllers.BuildingController", "all2", Seq())
)
                              
 
// @LINE:16
def deleteBuilding(id:Long) = new play.api.mvc.HandlerRef(
   controllers.BuildingController.deleteBuilding(id), HandlerDef(this, "controllers.BuildingController", "deleteBuilding", Seq(classOf[Long]))
)
                              
 
// @LINE:37
def sayHello3() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.sayHello3(), HandlerDef(this, "controllers.BuildingController", "sayHello3", Seq())
)
                              
 
// @LINE:25
def createEvent() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.createEvent(), HandlerDef(this, "controllers.BuildingController", "createEvent", Seq())
)
                              
 
// @LINE:14
def createBuilding() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.createBuilding(), HandlerDef(this, "controllers.BuildingController", "createBuilding", Seq())
)
                              
 
// @LINE:18
def rooms(buildingId:Long) = new play.api.mvc.HandlerRef(
   controllers.BuildingController.rooms(buildingId), HandlerDef(this, "controllers.BuildingController", "rooms", Seq(classOf[Long]))
)
                              
 
// @LINE:21
def all() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.all(), HandlerDef(this, "controllers.BuildingController", "all", Seq())
)
                              
 
// @LINE:35
def sayHello() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.sayHello(), HandlerDef(this, "controllers.BuildingController", "sayHello", Seq())
)
                              
 
// @LINE:26
def saveEvent() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.saveEvent(), HandlerDef(this, "controllers.BuildingController", "saveEvent", Seq())
)
                              
 
// @LINE:34
def jsontest() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.jsontest(), HandlerDef(this, "controllers.BuildingController", "jsontest", Seq())
)
                              
 
// @LINE:15
def saveBuilding() = new play.api.mvc.HandlerRef(
   controllers.BuildingController.saveBuilding(), HandlerDef(this, "controllers.BuildingController", "saveBuilding", Seq())
)
                              
 
// @LINE:24
def roomEvents(id:Long) = new play.api.mvc.HandlerRef(
   controllers.BuildingController.roomEvents(id), HandlerDef(this, "controllers.BuildingController", "roomEvents", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def newTask() = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq())
)
                              
 
// @LINE:30
def tasks2() = new play.api.mvc.HandlerRef(
   controllers.Application.tasks2(), HandlerDef(this, "controllers.Application", "tasks2", Seq())
)
                              
 
// @LINE:11
def deleteTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]))
)
                              
 
// @LINE:31
def newTask2() = new play.api.mvc.HandlerRef(
   controllers.Application.newTask2(), HandlerDef(this, "controllers.Application", "newTask2", Seq())
)
                              
 
// @LINE:32
def deleteTask2(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask2(id), HandlerDef(this, "controllers.Application", "deleteTask2", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:9
def tasks() = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq())
)
                              

                      
    
}
                            

// @LINE:41
class ReverseAssets {
    


 
// @LINE:41
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                