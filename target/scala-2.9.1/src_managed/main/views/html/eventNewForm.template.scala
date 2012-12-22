
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
object eventNewForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Event],Long,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(eventForm: Form[Event], roomId:Long):play.api.templates.Html = {
        _display_ {import helper._ 

import play.api.data.FormError

def /*5.2*/title/*5.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*5.11*/("""
    Add a new contact <small><a href="routes.BuildingController.buildings">Or edit an existing contact</a></small>
""")))};
Seq[Any](format.raw/*1.39*/(""" 
"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""


"""),_display_(Seq[Any](/*10.2*/main(title, nav = "buildings")/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""

<h2>create event</h2>



"""),_display_(Seq[Any](/*16.2*/form(routes.BuildingController.saveEvent)/*16.43*/ {_display_(Seq[Any](format.raw/*16.45*/("""
"""),_display_(Seq[Any](/*17.2*/inputText(eventForm("name"),'_label -> "nameppppppp"))),format.raw/*17.55*/("""
"""),_display_(Seq[Any](/*18.2*/inputText(eventForm("description")))),format.raw/*18.37*/("""

<div class="actions">
	<input type="submit" value="Create"> or <a
		href=""""),_display_(Seq[Any](/*22.10*/routes/*22.16*/.BuildingController.roomEvents(roomId))),format.raw/*22.54*/("""" class="btn">Cancel</a>
</div>
""")))})),format.raw/*24.2*/(""" """)))})),format.raw/*24.4*/("""
"""))}
    }
    
    def render(eventForm:Form[Event],roomId:Long) = apply(eventForm,roomId)
    
    def f:((Form[Event],Long) => play.api.templates.Html) = (eventForm,roomId) => apply(eventForm,roomId)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 15 22:56:14 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/eventNewForm.scala.html
                    HASH: fef53814f4eae5eee758539ac632cde0c9d96d54
                    MATRIX: 522->1|670->96|682->101|749->105|907->38|936->93|964->224|1006->231|1045->261|1085->263|1154->297|1204->338|1244->340|1282->343|1357->396|1395->399|1452->434|1569->515|1584->521|1644->559|1710->594|1743->596
                    LINES: 19->1|24->5|24->5|26->5|29->1|30->4|31->7|34->10|34->10|34->10|40->16|40->16|40->16|41->17|41->17|42->18|42->18|46->22|46->22|46->22|48->24|48->24
                    -- GENERATED --
                */
            