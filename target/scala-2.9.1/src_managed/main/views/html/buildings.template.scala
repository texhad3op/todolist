
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
object buildings extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Building],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(buildings: List[Building]):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href=""""),_display_(Seq[Any](/*6.40*/routes/*6.46*/.BuildingController.buildings)),format.raw/*6.75*/("""">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
    
    <h1>"""),_display_(Seq[Any](/*12.10*/buildings/*12.19*/.size)),format.raw/*12.24*/(""" building(s)</h1><br>
    <a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.BuildingController.createBuilding())),format.raw/*13.57*/("""">Add a new building</a>
    <br>
    <ul>
        """),_display_(Seq[Any](/*16.10*/buildings/*16.19*/.map/*16.23*/ { building =>_display_(Seq[Any](format.raw/*16.37*/("""
            <li>
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.BuildingController.rooms(building.id))),format.raw/*18.71*/("""">"""),_display_(Seq[Any](/*18.74*/building/*18.82*/.name)),format.raw/*18.87*/("""</a>
                """),_display_(Seq[Any](/*19.18*/form(routes.BuildingController.deleteBuilding(building.id))/*19.77*/ {_display_(Seq[Any](format.raw/*19.79*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*21.18*/("""        
            </li>
        """)))})),format.raw/*23.10*/("""
    </ul>
    
""")))})),format.raw/*26.2*/("""
"""))}
    }
    
    def render(buildings:List[Building]) = apply(buildings)
    
    def f:((List[Building]) => play.api.templates.Html) = (buildings) => apply(buildings)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/buildings.scala.html
                    HASH: 05cc6a73cf8686d132f996606c23242224da653e
                    MATRIX: 517->1|621->53|633->58|700->62|776->103|790->109|840->138|923->28|953->50|981->182|1023->189|1062->219|1102->221|1155->238|1173->247|1200->252|1273->289|1288->295|1346->331|1437->386|1455->395|1468->399|1520->413|1602->459|1617->465|1677->503|1716->506|1733->514|1760->519|1819->542|1887->601|1927->603|2036->680|2106->718|2157->738
                    LINES: 19->1|22->5|22->5|24->5|25->6|25->6|25->6|27->1|29->4|30->7|33->10|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|39->16|39->16|39->16|39->16|41->18|41->18|41->18|41->18|41->18|41->18|42->19|42->19|42->19|44->21|46->23|49->26
                    -- GENERATED --
                */
            