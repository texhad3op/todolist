
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
object roomNewForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Room],Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(roomForm: Form[Room], buildingId:Long):play.api.templates.Html = {
        _display_ {import helper._ 

import play.api.data.FormError

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href="routes.BuildingController.rooms">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.41*/(""" 
"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "rooms")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""

<h2>create building</h2>
<ul>
	"""),_display_(Seq[Any](/*14.3*/roomForm/*14.11*/.errors.map/*14.22*/ { error:FormError =>_display_(Seq[Any](format.raw/*14.43*/("""
	"""),_display_(Seq[Any](/*15.3*/if(error.key.equals(""))/*15.27*/{_display_(Seq[Any](format.raw/*15.28*/("""
	<li>!"""),_display_(Seq[Any](/*16.8*/error/*16.13*/.key)),format.raw/*16.17*/("""! """),_display_(Seq[Any](/*16.20*/error/*16.25*/.message)),format.raw/*16.33*/("""</li> 
	""")))})),format.raw/*17.3*/("""
	""")))})),format.raw/*18.3*/("""
</ul>


"""),_display_(Seq[Any](/*22.2*/form(routes.BuildingController.saveRoom)/*22.42*/ {_display_(Seq[Any](format.raw/*22.44*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(roomForm("number"),'_label -> "room number"))),format.raw/*23.56*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(roomForm("floor"),'_label -> "floor"))),format.raw/*24.49*/("""


<div class="actions">
	<input type="submit" value="Create"> or <a
		href=""""),_display_(Seq[Any](/*29.10*/routes/*29.16*/.BuildingController.rooms(buildingId))),format.raw/*29.53*/("""" class="btn">Cancel</a>
</div>
""")))})),format.raw/*31.2*/(""" """)))})),format.raw/*31.4*/("""
"""))}
    }
    
    def render(roomForm:Form[Room],buildingId:Long) = apply(roomForm,buildingId)
    
    def f:((Form[Room],Long) => play.api.templates.Html) = (roomForm,buildingId) => apply(roomForm,buildingId)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 22:19:20 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/roomNewForm.scala.html
                    HASH: 553a7a8d885d554671b0bdcf05edff17230ebcaa
                    MATRIX: 520->1|670->98|682->103|749->107|903->40|932->95|960->222|1002->229|1037->255|1077->257|1150->295|1167->303|1187->314|1246->335|1285->339|1318->363|1357->364|1401->373|1415->378|1441->382|1480->385|1494->390|1524->398|1565->408|1600->412|1649->426|1698->466|1738->468|1776->471|1852->525|1890->528|1959->575|2078->658|2093->664|2152->701|2218->736|2251->738
                    LINES: 19->1|24->5|24->5|26->5|29->1|30->4|31->7|34->10|34->10|34->10|38->14|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|46->22|46->22|46->22|47->23|47->23|48->24|48->24|53->29|53->29|53->29|55->31|55->31
                    -- GENERATED --
                */
            