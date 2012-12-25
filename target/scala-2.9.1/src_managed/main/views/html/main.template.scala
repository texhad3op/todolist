
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""
<!DOCTYPE html>
<html>
<head>
<title>Form samples</title>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.46*/routes/*6.52*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("stylesheets/main.css"))),format.raw/*7.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("images/favicon.png"))),format.raw/*8.89*/("""">
<script src=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*9.66*/("""" type="text/javascript"></script>
</head>
<body>
	<div class="topbar">
		<div class="fill">
			<div class="container">
				<a class="brand" href=""""),_display_(Seq[Any](/*15.29*/routes/*15.35*/.Application.index())),format.raw/*15.55*/("""">Forms</a>
				<ul class="nav">
					<li class=""""),_display_(Seq[Any](/*17.18*/(" active".when(nav=="tasks")))),format.raw/*17.48*/(""""><a
						href=""""),_display_(Seq[Any](/*18.14*/routes/*18.20*/.Application.tasks)),format.raw/*18.38*/("""">Tasks</a></li>
					<li class=""""),_display_(Seq[Any](/*19.18*/(" active".when(nav=="buildings")))),format.raw/*19.52*/(""""><a
						href=""""),_display_(Seq[Any](/*20.14*/routes/*20.20*/.BuildingController.buildings)),format.raw/*20.49*/("""">Buildings</a></li>
					<li class=""""),_display_(Seq[Any](/*21.18*/(" active".when(nav=="tasks2")))),format.raw/*21.49*/(""""><a
						href=""""),_display_(Seq[Any](/*22.14*/routes/*22.20*/.Application.tasks2)),format.raw/*22.39*/("""">Tasks2</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="content">
			<div class="page-header">
				<h1>"""),_display_(Seq[Any](/*30.10*/title)),format.raw/*30.15*/("""</h1>
			</div>
			<div class="row">
				<div class="span14">"""),_display_(Seq[Any](/*33.26*/content)),format.raw/*33.33*/("""</div>
			</div>
		</div>
		<footer>
			<p>
				<a href="http://www.playframework.org">www.playframework.org</a>
			</p>
		</footer>
	</div>
</body>
</html>"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 22 23:55:07 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/main.scala.html
                    HASH: a8283eb9dfc1acdfe549bb4f8d559d6da2881260
                    MATRIX: 514->1|637->47|781->156|795->162|855->201|939->250|953->256|1008->290|1097->344|1111->350|1164->382|1217->400|1231->406|1297->451|1487->605|1502->611|1544->631|1632->683|1684->713|1739->732|1754->738|1794->756|1865->791|1921->825|1976->844|1991->850|2042->879|2117->918|2170->949|2225->968|2240->974|2281->993|2467->1143|2494->1148|2595->1213|2624->1220
                    LINES: 19->1|22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|36->15|36->15|36->15|38->17|38->17|39->18|39->18|39->18|40->19|40->19|41->20|41->20|41->20|42->21|42->21|43->22|43->22|43->22|51->30|51->30|54->33|54->33
                    -- GENERATED --
                */
            