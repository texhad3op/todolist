
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Form samples"))/*1.28*/ {_display_(Seq[Any](format.raw/*1.30*/("""
    
    <h2>Sign up form</h2>
    
    <p>
        Demonstrate a classical sign up form.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.Application.tasks)),format.raw/*10.55*/("""">Tasks</a>
    </p>
    
    <h2>Contact form</h2>
    
    <p>
        Demonstrate a contact manager that allow to add complex contact informations.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.BuildingController.buildings)),format.raw/*20.66*/("""">Buildings</a>
    </p>
     <p>
        Demonstrate a classical sign up form2.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*27.31*/routes/*27.37*/.Application.tasks2)),format.raw/*27.56*/("""">Tasks2</a>
    </p>   
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/index.scala.html
                    HASH: cfe2b1c63738c1026d2c705b7db0754a24115d4c
                    MATRIX: 578->1|612->27|651->29|839->181|854->187|894->205|1143->418|1158->424|1209->453|1385->593|1400->599|1441->618
                    LINES: 22->1|22->1|22->1|31->10|31->10|31->10|41->20|41->20|41->20|48->27|48->27|48->27
                    -- GENERATED --
                */
            