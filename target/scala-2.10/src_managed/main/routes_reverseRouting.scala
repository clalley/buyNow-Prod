// @SOURCE:C:/Users/Jason/Documents/buyNow-Prod/conf/routes
// @HASH:26fcf4e70d42e725defac41af53314120893eeaa
// @DATE:Wed Jan 22 21:50:18 CST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseBuyNowMain {
    

// @LINE:5
def GetCityState(Zipcode:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GetCityState" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("Zipcode", Zipcode)))))
}
                                                

// @LINE:7
def convert(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getAllCustomers" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:11
def getAllTransactions(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getTransactions" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:9
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getwsdl")
}
                                                

// @LINE:8
def getiddata(id:String, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getCustomer" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)), Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:4
def insertBuyNowData(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "insertBuyNowData")
}
                                                

// @LINE:2
def newBuyNowForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newBuyNowForm")
}
                                                

// @LINE:12
def updateTransactions(code:String, ids:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "updateTransactions" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)), Some(implicitly[QueryStringBindable[String]].unbind("ids", ids)))))
}
                                                

// @LINE:3
def insertBuyNowRef(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "insertBuyNowRef")
}
                                                

// @LINE:1
def Start(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.javascript {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseBuyNowMain {
    

// @LINE:5
def GetCityState : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.GetCityState",
   """
      function(Zipcode) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GetCityState" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("Zipcode", Zipcode)])})
      }
   """
)
                        

// @LINE:7
def convert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.convert",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllCustomers" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:11
def getAllTransactions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.getAllTransactions",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTransactions" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:9
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getwsdl"})
      }
   """
)
                        

// @LINE:8
def getiddata : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.getiddata",
   """
      function(id,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getCustomer" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:4
def insertBuyNowData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.insertBuyNowData",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertBuyNowData"})
      }
   """
)
                        

// @LINE:2
def newBuyNowForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.newBuyNowForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newBuyNowForm"})
      }
   """
)
                        

// @LINE:12
def updateTransactions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.updateTransactions",
   """
      function(code,ids) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateTransactions" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ids", ids)])})
      }
   """
)
                        

// @LINE:3
def insertBuyNowRef : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.insertBuyNowRef",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertBuyNowRef"})
      }
   """
)
                        

// @LINE:1
def Start : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BuyNowMain.Start",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.ref {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseBuyNowMain {
    

// @LINE:5
def GetCityState(Zipcode:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.GetCityState(Zipcode), HandlerDef(this, "controllers.BuyNowMain", "GetCityState", Seq(classOf[String]), "GET", """""", _prefix + """GetCityState""")
)
                      

// @LINE:7
def convert(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.convert(code), HandlerDef(this, "controllers.BuyNowMain", "convert", Seq(classOf[String]), "GET", """""", _prefix + """getAllCustomers""")
)
                      

// @LINE:11
def getAllTransactions(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.getAllTransactions(code), HandlerDef(this, "controllers.BuyNowMain", "getAllTransactions", Seq(classOf[String]), "GET", """""", _prefix + """getTransactions""")
)
                      

// @LINE:9
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.main(), HandlerDef(this, "controllers.BuyNowMain", "main", Seq(), "GET", """""", _prefix + """getwsdl""")
)
                      

// @LINE:8
def getiddata(id:String, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.getiddata(id, code), HandlerDef(this, "controllers.BuyNowMain", "getiddata", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """getCustomer""")
)
                      

// @LINE:4
def insertBuyNowData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.insertBuyNowData(), HandlerDef(this, "controllers.BuyNowMain", "insertBuyNowData", Seq(), "POST", """""", _prefix + """insertBuyNowData""")
)
                      

// @LINE:2
def newBuyNowForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.newBuyNowForm(), HandlerDef(this, "controllers.BuyNowMain", "newBuyNowForm", Seq(), "GET", """""", _prefix + """newBuyNowForm""")
)
                      

// @LINE:12
def updateTransactions(code:String, ids:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.updateTransactions(code, ids), HandlerDef(this, "controllers.BuyNowMain", "updateTransactions", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """updateTransactions""")
)
                      

// @LINE:3
def insertBuyNowRef(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.insertBuyNowRef(), HandlerDef(this, "controllers.BuyNowMain", "insertBuyNowRef", Seq(), "POST", """""", _prefix + """insertBuyNowRef""")
)
                      

// @LINE:1
def Start(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BuyNowMain.Start(), HandlerDef(this, "controllers.BuyNowMain", "Start", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
                  
      