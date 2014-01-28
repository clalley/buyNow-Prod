
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
import models.BuyNowData
/**/
object start extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Start],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(startForm: Form[Start]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*4.1*/("""<body style="background-color:#EEAA1F;">

	<div class="wrapper">
		<div class="left"></div>
		<div class="center"><span>
			<center><img src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("images/HolmesMotorsLogo.png"))),format.raw/*9.70*/(""""/></center>
			<h1><center>Start the Holmes Motors Buy Now Application</center></h1>
			"""),_display_(Seq[Any](/*11.5*/helper/*11.11*/.form(action = routes.BuyNowMain.newBuyNowForm())/*11.60*/ {_display_(Seq[Any](format.raw/*11.62*/("""
			<center><button type="submit" name="submitButton" class="btn btn-primary" value="StartHere">Start Here</button></center>
			<h1><center></center></h1>
			<h1><center></center></h1>
			<h1><center>NO CREDIT CHECK</center></h1>
			<h1><center>NO CONTRACT</center></h1>
			<h1><center>2.9% FINANCING FOR ALL</center></h1>
			<h1><center>NO REJECTIONS WITH VALID DL AND DOWN PAYMENT </center></h1>
		</span></div>
   		<div class="right"></div>
	</div>


""")))})),format.raw/*24.2*/("""
   
   
</body>"""))}
    }
    
    def render(startForm:Form[Start]): play.api.templates.Html = apply(startForm)
    
    def f:((Form[Start]) => play.api.templates.Html) = (startForm) => apply(startForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 28 13:03:07 CST 2014
                    SOURCE: C:/Users/Jason/Documents/buyNow-Prod/app/views/start.scala.html
                    HASH: ebebd753d442085636e48d51c1a42c847bb5bf22
                    MATRIX: 753->1|906->25|934->80|1117->228|1131->234|1193->275|1320->367|1335->373|1393->422|1433->424|1933->893
                    LINES: 27->1|33->1|34->4|39->9|39->9|39->9|41->11|41->11|41->11|41->11|54->24
                    -- GENERATED --
                */
            