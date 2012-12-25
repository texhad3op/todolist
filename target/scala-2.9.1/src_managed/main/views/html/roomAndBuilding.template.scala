
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
object roomAndBuilding extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[scala.Tuple2[Room, Building]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(rb: List[(Room, Building)]):play.api.templates.Html = {
        _display_ {import helper._ 

def /*3.2*/title/*3.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.11*/(""" Add a new contact
<small><a href="routes.Application.createRoom()">Or edit an
		existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.30*/(""" 
"""),format.raw/*6.2*/(""" 
"""),_display_(Seq[Any](/*7.2*/main(title, nav = "buildings")/*7.32*/ {_display_(Seq[Any](format.raw/*7.34*/("""

<br>
<br>

<table border="1">

	"""),_display_(Seq[Any](/*14.3*/rb/*14.5*/.map/*14.9*/ { roomAndBuilding: (Room, Building) =>_display_(Seq[Any](format.raw/*14.48*/("""
	<tr>
		<td>"""),_display_(Seq[Any](/*16.8*/roomAndBuilding/*16.23*/._1.number.toString)),format.raw/*16.42*/("""</td>
		<td>"""),_display_(Seq[Any](/*17.8*/roomAndBuilding/*17.23*/._2.address)),format.raw/*17.34*/("""</td>

	</tr>
	""")))})),format.raw/*20.3*/("""
</table>

""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(rb:List[scala.Tuple2[Room, Building]]) = apply(rb)
    
    def f:((List[scala.Tuple2[Room, Building]]) => play.api.templates.Html) = (rb) => apply(rb)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 22 23:54:14 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/roomAndBuilding.scala.html
                    HASH: baaedb8fb171feba2c7d09946b7caddf6bb9f8ad
                    MATRIX: 543->1|649->52|661->57|728->61|881->29|910->175|948->179|986->209|1025->211|1102->253|1112->255|1124->259|1201->298|1252->314|1276->329|1317->348|1366->362|1390->377|1423->388|1473->407|1519->422
                    LINES: 19->1|22->3|22->3|24->3|28->1|29->6|30->7|30->7|30->7|37->14|37->14|37->14|37->14|39->16|39->16|39->16|40->17|40->17|40->17|43->20|46->23
                    -- GENERATED --
                */
            