
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
object buildingNewForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Building],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(buildingForm: Form[Building]):play.api.templates.Html = {
        _display_ {import helper._ 

import play.api.data.FormError

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href=""""),_display_(Seq[Any](/*6.40*/routes/*6.46*/.BuildingController.buildings)),format.raw/*6.75*/("""">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.32*/(""" 
"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""

<h2>create building</h2>
<ul>
	"""),_display_(Seq[Any](/*14.3*/buildingForm/*14.15*/.errors.map/*14.26*/ { error:FormError =>_display_(Seq[Any](format.raw/*14.47*/("""
	"""),_display_(Seq[Any](/*15.3*/if(error.key.equals(""))/*15.27*/{_display_(Seq[Any](format.raw/*15.28*/("""
	<li>!"""),_display_(Seq[Any](/*16.8*/error/*16.13*/.key)),format.raw/*16.17*/("""! """),_display_(Seq[Any](/*16.20*/error/*16.25*/.message)),format.raw/*16.33*/("""</li> 
	""")))})),format.raw/*17.3*/("""
	""")))})),format.raw/*18.3*/("""
</ul>


"""),_display_(Seq[Any](/*22.2*/form(routes.BuildingController.saveBuilding)/*22.46*/ {_display_(Seq[Any](format.raw/*22.48*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(buildingForm("name"),'_label -> "nameppppppp"))),format.raw/*23.58*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(buildingForm("address")))),format.raw/*24.36*/("""
"""),_display_(Seq[Any](/*25.2*/inputText(buildingForm("description")))),format.raw/*25.40*/("""

<div class="actions">
	<input type="submit" value="Create"> or <a
		href=""""),_display_(Seq[Any](/*29.10*/routes/*29.16*/.BuildingController.buildings())),format.raw/*29.47*/("""" class="btn">Cancel</a>
</div>
""")))})),format.raw/*31.2*/(""" """)))})),format.raw/*31.4*/("""
"""))}
    }
    
    def render(buildingForm:Form[Building]) = apply(buildingForm)
    
    def f:((Form[Building]) => play.api.templates.Html) = (buildingForm) => apply(buildingForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/buildingNewForm.scala.html
                    HASH: 2d99e7d05c8c61e0051c25d63956fe74d9f45838
                    MATRIX: 523->1|664->89|676->94|743->98|819->139|833->145|883->174|966->31|995->86|1023->218|1065->225|1104->255|1144->257|1217->295|1238->307|1258->318|1317->339|1356->343|1389->367|1428->368|1472->377|1486->382|1512->386|1551->389|1565->394|1595->402|1636->412|1671->416|1720->430|1773->474|1813->476|1851->479|1929->535|1967->538|2023->572|2061->575|2121->613|2238->694|2253->700|2306->731|2372->766|2405->768
                    LINES: 19->1|24->5|24->5|26->5|27->6|27->6|27->6|29->1|30->4|31->7|34->10|34->10|34->10|38->14|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|41->17|42->18|46->22|46->22|46->22|47->23|47->23|48->24|48->24|49->25|49->25|53->29|53->29|53->29|55->31|55->31
                    -- GENERATED --
                */
            