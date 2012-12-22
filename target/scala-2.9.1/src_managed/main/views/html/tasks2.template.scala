
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object tasks2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task2],Form[Task2],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks2: List[Task2], taskForm2: Form[Task2]):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href=""""),_display_(Seq[Any](/*6.40*/routes/*6.46*/.Application.tasks2)),format.raw/*6.65*/("""">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.47*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "tasks2")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
    
    <h1>"""),_display_(Seq[Any](/*12.10*/tasks2/*12.16*/.size)),format.raw/*12.21*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*15.10*/tasks2/*15.16*/.map/*15.20*/ { task2 =>_display_(Seq[Any](format.raw/*15.31*/("""
            <li>
                """),_display_(Seq[Any](/*17.18*/task2/*17.23*/.label)),format.raw/*17.29*/("""
                
                """),_display_(Seq[Any](/*19.18*/form(routes.Application.deleteTask2(task2.id))/*19.64*/ {_display_(Seq[Any](format.raw/*19.66*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*21.18*/("""
            </li>
        """)))})),format.raw/*23.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq[Any](/*28.6*/form(routes.Application.newTask2)/*28.39*/ {_display_(Seq[Any](format.raw/*28.41*/("""
        
        """),_display_(Seq[Any](/*30.10*/inputText(taskForm2("label")))),format.raw/*30.39*/(""" 
        """),_display_(Seq[Any](/*31.10*/inputText(taskForm2("description")))),format.raw/*31.45*/("""         
        <input type="submit" value="Create">
        
    """)))})),format.raw/*34.6*/("""
    
""")))})))}
    }
    
    def render(tasks2:List[Task2],taskForm2:Form[Task2]) = apply(tasks2,taskForm2)
    
    def f:((List[Task2],Form[Task2]) => play.api.templates.Html) = (tasks2,taskForm2) => apply(tasks2,taskForm2)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/tasks2.scala.html
                    HASH: 1375aeeb8f36c39efb08870485618cb875573fee
                    MATRIX: 523->1|645->71|657->76|724->80|800->121|814->127|854->146|937->46|967->68|995->190|1037->197|1073->224|1113->226|1166->243|1181->249|1208->254|1284->294|1299->300|1312->304|1361->315|1434->352|1448->357|1476->363|1549->400|1604->446|1644->448|1753->525|1815->555|1909->614|1951->647|1991->649|2048->670|2099->699|2147->711|2204->746|2307->818
                    LINES: 19->1|22->5|22->5|24->5|25->6|25->6|25->6|27->1|29->4|30->7|33->10|33->10|33->10|35->12|35->12|35->12|38->15|38->15|38->15|38->15|40->17|40->17|40->17|42->19|42->19|42->19|44->21|46->23|51->28|51->28|51->28|53->30|53->30|54->31|54->31|57->34
                    -- GENERATED --
                */
            