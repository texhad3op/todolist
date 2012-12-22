
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
object roomEvents extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Event],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(events:List[Event]):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href="routes.Application.createRoom()">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
    
     
    <a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.BuildingController.createEvent())),format.raw/*13.54*/("""">Add a new Event</a>
    <br>
    <br>
    
<table border="1">
            <tr>
    <td>date</td><td>name</td><td>description</td>
                </tr>
        """),_display_(Seq[Any](/*21.10*/events/*21.16*/.map/*21.20*/ { event: Event =>_display_(Seq[Any](format.raw/*21.38*/("""
            <tr>
                <td>"""),_display_(Seq[Any](/*23.22*/event/*23.27*/.registrationDate)),format.raw/*23.44*/("""</td>
                <td>"""),_display_(Seq[Any](/*24.22*/event/*24.27*/.name)),format.raw/*24.32*/("""</td>
                <td>"""),_display_(Seq[Any](/*25.22*/event/*25.27*/.description)),format.raw/*25.39*/("""</td>
            </tr>
        """)))})),format.raw/*27.10*/("""
</table>    
   
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(events:List[Event]) = apply(events)
    
    def f:((List[Event]) => play.api.templates.Html) = (events) => apply(events)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 09 22:11:53 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/roomEvents.scala.html
                    HASH: d977deb22e34e5fb02dc12b281fb2cf3fa5fa8f2
                    MATRIX: 515->1|612->46|624->51|691->55|845->21|875->43|903->170|945->177|984->207|1024->209|1089->238|1104->244|1159->277|1366->448|1381->454|1394->458|1450->476|1527->517|1541->522|1580->539|1644->567|1658->572|1685->577|1749->605|1763->610|1797->622|1864->657|1917->679
                    LINES: 19->1|22->5|22->5|24->5|27->1|29->4|30->7|33->10|33->10|33->10|36->13|36->13|36->13|44->21|44->21|44->21|44->21|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|50->27|53->30
                    -- GENERATED --
                */
            