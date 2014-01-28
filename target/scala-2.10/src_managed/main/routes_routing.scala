// @SOURCE:C:/Users/Jason/Documents/buyNow-Prod/conf/routes
// @HASH:26fcf4e70d42e725defac41af53314120893eeaa
// @DATE:Wed Jan 22 21:50:18 CST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:1
private[this] lazy val controllers_BuyNowMain_Start0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:2
private[this] lazy val controllers_BuyNowMain_newBuyNowForm1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newBuyNowForm"))))
        

// @LINE:3
private[this] lazy val controllers_BuyNowMain_insertBuyNowRef2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insertBuyNowRef"))))
        

// @LINE:4
private[this] lazy val controllers_BuyNowMain_insertBuyNowData3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("insertBuyNowData"))))
        

// @LINE:5
private[this] lazy val controllers_BuyNowMain_GetCityState4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GetCityState"))))
        

// @LINE:7
private[this] lazy val controllers_BuyNowMain_convert5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getAllCustomers"))))
        

// @LINE:8
private[this] lazy val controllers_BuyNowMain_getiddata6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getCustomer"))))
        

// @LINE:9
private[this] lazy val controllers_BuyNowMain_main7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getwsdl"))))
        

// @LINE:11
private[this] lazy val controllers_BuyNowMain_getAllTransactions8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getTransactions"))))
        

// @LINE:12
private[this] lazy val controllers_BuyNowMain_updateTransactions9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateTransactions"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.BuyNowMain.Start()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newBuyNowForm""","""controllers.BuyNowMain.newBuyNowForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insertBuyNowRef""","""controllers.BuyNowMain.insertBuyNowRef()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """insertBuyNowData""","""controllers.BuyNowMain.insertBuyNowData()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GetCityState""","""controllers.BuyNowMain.GetCityState(Zipcode:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getAllCustomers""","""controllers.BuyNowMain.convert(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getCustomer""","""controllers.BuyNowMain.getiddata(id:String, code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getwsdl""","""controllers.BuyNowMain.main"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getTransactions""","""controllers.BuyNowMain.getAllTransactions(code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateTransactions""","""controllers.BuyNowMain.updateTransactions(code:String, ids:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:1
case controllers_BuyNowMain_Start0(params) => {
   call { 
        invokeHandler(controllers.BuyNowMain.Start(), HandlerDef(this, "controllers.BuyNowMain", "Start", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:2
case controllers_BuyNowMain_newBuyNowForm1(params) => {
   call { 
        invokeHandler(controllers.BuyNowMain.newBuyNowForm(), HandlerDef(this, "controllers.BuyNowMain", "newBuyNowForm", Nil,"GET", """""", Routes.prefix + """newBuyNowForm"""))
   }
}
        

// @LINE:3
case controllers_BuyNowMain_insertBuyNowRef2(params) => {
   call { 
        invokeHandler(controllers.BuyNowMain.insertBuyNowRef(), HandlerDef(this, "controllers.BuyNowMain", "insertBuyNowRef", Nil,"POST", """""", Routes.prefix + """insertBuyNowRef"""))
   }
}
        

// @LINE:4
case controllers_BuyNowMain_insertBuyNowData3(params) => {
   call { 
        invokeHandler(controllers.BuyNowMain.insertBuyNowData(), HandlerDef(this, "controllers.BuyNowMain", "insertBuyNowData", Nil,"POST", """""", Routes.prefix + """insertBuyNowData"""))
   }
}
        

// @LINE:5
case controllers_BuyNowMain_GetCityState4(params) => {
   call(params.fromQuery[String]("Zipcode", None)) { (Zipcode) =>
        invokeHandler(controllers.BuyNowMain.GetCityState(Zipcode), HandlerDef(this, "controllers.BuyNowMain", "GetCityState", Seq(classOf[String]),"GET", """""", Routes.prefix + """GetCityState"""))
   }
}
        

// @LINE:7
case controllers_BuyNowMain_convert5(params) => {
   call(params.fromQuery[String]("code", None)) { (code) =>
        invokeHandler(controllers.BuyNowMain.convert(code), HandlerDef(this, "controllers.BuyNowMain", "convert", Seq(classOf[String]),"GET", """""", Routes.prefix + """getAllCustomers"""))
   }
}
        

// @LINE:8
case controllers_BuyNowMain_getiddata6(params) => {
   call(params.fromQuery[String]("id", None), params.fromQuery[String]("code", None)) { (id, code) =>
        invokeHandler(controllers.BuyNowMain.getiddata(id, code), HandlerDef(this, "controllers.BuyNowMain", "getiddata", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """getCustomer"""))
   }
}
        

// @LINE:9
case controllers_BuyNowMain_main7(params) => {
   call { 
        invokeHandler(controllers.BuyNowMain.main, HandlerDef(this, "controllers.BuyNowMain", "main", Nil,"GET", """""", Routes.prefix + """getwsdl"""))
   }
}
        

// @LINE:11
case controllers_BuyNowMain_getAllTransactions8(params) => {
   call(params.fromQuery[String]("code", None)) { (code) =>
        invokeHandler(controllers.BuyNowMain.getAllTransactions(code), HandlerDef(this, "controllers.BuyNowMain", "getAllTransactions", Seq(classOf[String]),"GET", """""", Routes.prefix + """getTransactions"""))
   }
}
        

// @LINE:12
case controllers_BuyNowMain_updateTransactions9(params) => {
   call(params.fromQuery[String]("code", None), params.fromQuery[String]("ids", None)) { (code, ids) =>
        invokeHandler(controllers.BuyNowMain.updateTransactions(code, ids), HandlerDef(this, "controllers.BuyNowMain", "updateTransactions", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """updateTransactions"""))
   }
}
        

// @LINE:14
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        