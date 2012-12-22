
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
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">Forms</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "tasks")))),format.raw/*20.68*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.Application.tasks)),format.raw/*21.63*/("""">Tasks</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*23.37*/("active".when(nav == "buildings")))),format.raw/*23.72*/("""">
                            <a href=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.BuildingController.buildings)),format.raw/*24.74*/("""">Buildings</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*26.37*/("active".when(nav == "tasks2")))),format.raw/*26.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Application.tasks2)),format.raw/*27.64*/("""">Tasks2</a>
                        </li>                      
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*39.26*/title)),format.raw/*39.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*44.26*/content)),format.raw/*44.33*/("""
                    </div>
                </div>
                
            </div>

            <footer>
                <p>
                    <a href="http://www.playframework.org">www.playframework.org</a>
                </p>
            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 08 17:32:27 EET 2012
                    SOURCE: C:/play-2.0.4/samples/scala/todolist/app/views/main.scala.html
                    HASH: d85689a849c94e9dc38f7784768957563c6ffe1f
                    MATRIX: 514->1|637->47|798->173|812->179|872->218|963->274|977->280|1032->314|1129->375|1144->381|1198->413|1259->438|1274->444|1341->489|1588->700|1603->706|1645->726|1766->811|1819->842|1896->883|1911->889|1951->907|2065->985|2122->1020|2199->1061|2214->1067|2265->1096|2383->1178|2437->1210|2514->1251|2529->1257|2570->1276|2906->1576|2933->1581|3099->1711|3128->1718
                    LINES: 19->1|22->1|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|39->18|39->18|39->18|41->20|41->20|42->21|42->21|42->21|44->23|44->23|45->24|45->24|45->24|47->26|47->26|48->27|48->27|48->27|60->39|60->39|65->44|65->44
                    -- GENERATED --
                */
            