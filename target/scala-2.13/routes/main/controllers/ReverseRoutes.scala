// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:9
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:12
  class ReversePatientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def createPatientPrueba(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patient/instance")
    }
  
    // @LINE:12
    def listPatients(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients")
    }
  
    // @LINE:16
    def delete(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:15
    def update(id:Int): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:13
    def retrieve(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:14
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "patients")
    }
  
  }

  // @LINE:18
  class ReverseDroolsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def diagnosePatient(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/diagnose")
    }
  
  }


}
