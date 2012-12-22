
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
object tasks extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href=""""),_display_(Seq[Any](/*6.40*/routes/*6.46*/.Application.tasks)),format.raw/*6.64*/("""">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "tasks")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
    
    """),_display_(Seq[Any](/*12.6*/title)),format.raw/*12.11*/("""
    <h1>"""),_display_(Seq[Any](/*13.10*/tasks/*13.15*/.size)),format.raw/*13.20*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*16.10*/tasks/*16.15*/.map/*16.19*/ { task =>_display_(Seq[Any](format.raw/*16.29*/("""
            <li>
                """),_display_(Seq[Any](/*18.18*/task/*18.22*/.label)),format.raw/*18.28*/("""
                
                """),_display_(Seq[Any](/*20.18*/form(routes.Application.deleteTask(task.id))/*20.62*/ {_display_(Seq[Any](format.raw/*20.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*22.18*/("""
            </li>
        """)))})),format.raw/*24.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq[Any](/*29.6*/form(routes.Application.newTask)/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""
        
        """),_display_(Seq[Any](/*31.10*/inputText(taskForm("label")))),format.raw/*31.38*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*35.6*/("""
    
""")))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[String]) = apply(tasks,taskForm)
    
    def f:((List[Task],Form[String]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/tasks.scala.html
                    HASH: e353ff5c6e8db743f2b58f627ed048d5c456b9b2
                    MATRIX: 522->1|642->69|654->74|721->78|797->119|811->125|850->143|933->44|963->66|991->187|1033->194|1068->220|1108->222|1156->235|1183->240|1230->251|1244->256|1271->261|1347->301|1361->306|1374->310|1422->320|1495->357|1508->361|1536->367|1609->404|1662->448|1702->450|1811->527|1873->557|1967->616|2008->648|2048->650|2105->671|2155->699|2260->773
                    LINES: 19->1|22->5|22->5|24->5|25->6|25->6|25->6|27->1|29->4|30->7|33->10|33->10|33->10|35->12|35->12|36->13|36->13|36->13|39->16|39->16|39->16|39->16|41->18|41->18|41->18|43->20|43->20|43->20|45->22|47->24|52->29|52->29|52->29|54->31|54->31|58->35
                    -- GENERATED --
                */
            