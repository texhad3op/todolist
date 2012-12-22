
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
object rooms extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Option[Building],List[scala.Tuple2[Room, Option[Event]]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(building: Option[Building],list:List[(Room, Option[Event])]):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href="routes.Application.createRoom()">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
    
    <h1>"""),_display_(Seq[Any](/*12.10*/building/*12.18*/.map(_.name).getOrElse(""))),format.raw/*12.44*/("""</h1><br>
    <h1>"""),_display_(Seq[Any](/*13.10*/building/*13.18*/.map(_.address).getOrElse(""))),format.raw/*13.47*/("""</h1><br>   
    <h1>"""),_display_(Seq[Any](/*14.10*/building/*14.18*/.map(_.description).getOrElse(""))),format.raw/*14.51*/("""</h1><br>        
    <a href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.BuildingController.createRoom())),format.raw/*15.53*/("""">Add a new Room</a>
    <br>
    <br>
    
<table border="1">
            <tr>
    <td>floor</td><td>roomnumber</td><td>eventdate</td><td>short description</td>
                </tr>
        """),_display_(Seq[Any](/*23.10*/list/*23.14*/.map/*23.18*/ { roomAndEvent: (Room, Option[Event]) =>_display_(Seq[Any](format.raw/*23.59*/("""
            <tr>
                <td>"""),_display_(Seq[Any](/*25.22*/roomAndEvent/*25.34*/._1.floor.toString)),format.raw/*25.52*/("""</td>
                <td><a href=""""),_display_(Seq[Any](/*26.31*/routes/*26.37*/.BuildingController.roomEvents(roomAndEvent._1.id))),format.raw/*26.87*/("""">"""),_display_(Seq[Any](/*26.90*/roomAndEvent/*26.102*/._1.number.toString)),format.raw/*26.121*/("""</a></td>
                <td>"""),_display_(Seq[Any](/*27.22*/roomAndEvent/*27.34*/._2.map(_.registrationDate).getOrElse("---"))),format.raw/*27.78*/("""</td><td> """),_display_(Seq[Any](/*27.89*/roomAndEvent/*27.101*/._2.map(_.name).getOrElse("---"))),format.raw/*27.133*/("""</td>
   
            </tr>
        """)))})),format.raw/*30.10*/("""
</table>    
   
""")))})),format.raw/*33.2*/("""
"""))}
    }
    
    def render(building:Option[Building],list:List[scala.Tuple2[Room, Option[Event]]]) = apply(building,list)
    
    def f:((Option[Building],List[scala.Tuple2[Room, Option[Event]]]) => play.api.templates.Html) = (building,list) => apply(building,list)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 09 20:25:48 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/rooms.scala.html
                    HASH: dd05870aa9ee1bc2978492b0a29ac7fe32aee0b4
                    MATRIX: 555->1|693->87|705->92|772->96|926->62|956->84|984->211|1026->218|1065->248|1105->250|1158->267|1175->275|1223->301|1279->321|1296->329|1347->358|1406->381|1423->389|1478->422|1547->455|1562->461|1616->493|1853->694|1866->698|1879->702|1958->743|2035->784|2056->796|2096->814|2169->851|2184->857|2256->907|2295->910|2317->922|2359->941|2427->973|2448->985|2514->1029|2561->1040|2583->1052|2638->1084|2710->1124|2763->1146
                    LINES: 19->1|22->5|22->5|24->5|27->1|29->4|30->7|33->10|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|46->23|46->23|46->23|46->23|48->25|48->25|48->25|49->26|49->26|49->26|49->26|49->26|49->26|50->27|50->27|50->27|50->27|50->27|50->27|53->30|56->33
                    -- GENERATED --
                */
            