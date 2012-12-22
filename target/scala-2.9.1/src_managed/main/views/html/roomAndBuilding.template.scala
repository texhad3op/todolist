
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

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href="routes.Application.createRoom()">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
    
    <br>
    <br>

<table border="1">
    
        """),_display_(Seq[Any](/*17.10*/rb/*17.12*/.map/*17.16*/ { roomAndBuilding: (Room, Building) =>_display_(Seq[Any](format.raw/*17.55*/("""
            <tr>
                <td>"""),_display_(Seq[Any](/*19.22*/roomAndBuilding/*19.37*/._1.number.toString)),format.raw/*19.56*/("""</td><td> """),_display_(Seq[Any](/*19.67*/roomAndBuilding/*19.82*/._2.address)),format.raw/*19.93*/("""</td>
   
            </tr>
        """)))})),format.raw/*22.10*/("""
</table>
    
""")))})))}
    }
    
    def render(rb:List[scala.Tuple2[Room, Building]]) = apply(rb)
    
    def f:((List[scala.Tuple2[Room, Building]]) => play.api.templates.Html) = (rb) => apply(rb)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/roomAndBuilding.scala.html
                    HASH: d7c82ca6f1fb0c901c41fefcb6d3e80b5fffdde2
                    MATRIX: 543->1|648->54|660->59|727->63|881->29|911->51|939->178|981->185|1020->215|1060->217|1161->282|1172->284|1185->288|1262->327|1339->368|1363->383|1404->402|1451->413|1475->428|1508->439|1580->479
                    LINES: 19->1|22->5|22->5|24->5|27->1|29->4|30->7|33->10|33->10|33->10|40->17|40->17|40->17|40->17|42->19|42->19|42->19|42->19|42->19|42->19|45->22
                    -- GENERATED --
                */
            