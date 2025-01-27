// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:12
  PatientController_2: controllers.PatientController,
  // @LINE:18
  DroolsController_3: controllers.DroolsController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:12
    PatientController_2: controllers.PatientController,
    // @LINE:18
    DroolsController_3: controllers.DroolsController
  ) = this(errorHandler, HomeController_0, Assets_1, PatientController_2, DroolsController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, PatientController_2, DroolsController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients""", """controllers.PatientController.listPatients()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.retrieve(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients""", """controllers.PatientController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.update(request:Request, id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>/diagnose""", """controllers.DroolsController.diagnosePatient(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patient/instance""", """controllers.PatientController.createPatientPrueba()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PatientController_listPatients2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_listPatients2_invoker = createInvoker(
    PatientController_2.listPatients(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "listPatients",
      Nil,
      "GET",
      this.prefix + """patients""",
      """ APIs in PatientController""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PatientController_retrieve3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_retrieve3_invoker = createInvoker(
    PatientController_2.retrieve(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "retrieve",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PatientController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_create4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PatientController_2.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """patients""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PatientController_update5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_update5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PatientController_2.update(fakeValue[play.mvc.Http.Request], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[Int]),
      "PUT",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PatientController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_delete6_invoker = createInvoker(
    PatientController_2.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DroolsController_diagnosePatient7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true), StaticPart("/diagnose")))
  )
  private[this] lazy val controllers_DroolsController_diagnosePatient7_invoker = createInvoker(
    DroolsController_3.diagnosePatient(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DroolsController",
      "diagnosePatient",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """patients/""" + "$" + """id<[^/]+>/diagnose""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_PatientController_createPatientPrueba8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patient/instance")))
  )
  private[this] lazy val controllers_PatientController_createPatientPrueba8_invoker = createInvoker(
    PatientController_2.createPatientPrueba(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "createPatientPrueba",
      Nil,
      "GET",
      this.prefix + """patient/instance""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_PatientController_listPatients2_route(params@_) =>
      call { 
        controllers_PatientController_listPatients2_invoker.call(PatientController_2.listPatients())
      }
  
    // @LINE:13
    case controllers_PatientController_retrieve3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_retrieve3_invoker.call(PatientController_2.retrieve(id))
      }
  
    // @LINE:14
    case controllers_PatientController_create4_route(params@_) =>
      call { 
        controllers_PatientController_create4_invoker.call(
          req => PatientController_2.create(req))
      }
  
    // @LINE:15
    case controllers_PatientController_update5_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_update5_invoker.call(
          req => PatientController_2.update(req, id))
      }
  
    // @LINE:16
    case controllers_PatientController_delete6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_delete6_invoker.call(PatientController_2.delete(id))
      }
  
    // @LINE:18
    case controllers_DroolsController_diagnosePatient7_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DroolsController_diagnosePatient7_invoker.call(DroolsController_3.diagnosePatient(id))
      }
  
    // @LINE:20
    case controllers_PatientController_createPatientPrueba8_route(params@_) =>
      call { 
        controllers_PatientController_createPatientPrueba8_invoker.call(PatientController_2.createPatientPrueba())
      }
  
    // @LINE:23
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
