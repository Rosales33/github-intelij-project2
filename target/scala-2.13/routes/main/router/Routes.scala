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
  HomeController_4: controllers.HomeController,
  // @LINE:9
  Assets_3: controllers.Assets,
  // @LINE:12
  EmployeeController_1: controllers.EmployeeController,
  // @LINE:19
  PatientController_0: controllers.PatientController,
  // @LINE:25
  DroolsController_2: controllers.DroolsController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_4: controllers.HomeController,
    // @LINE:9
    Assets_3: controllers.Assets,
    // @LINE:12
    EmployeeController_1: controllers.EmployeeController,
    // @LINE:19
    PatientController_0: controllers.PatientController,
    // @LINE:25
    DroolsController_2: controllers.DroolsController
  ) = this(errorHandler, HomeController_4, Assets_3, EmployeeController_1, PatientController_0, DroolsController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, Assets_3, EmployeeController_1, PatientController_0, DroolsController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.listEmployees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.retrieve(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.create(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.update(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.delete(id:Int)"""),
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
    HomeController_4.index(),
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
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_EmployeeController_listEmployees2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_listEmployees2_invoker = createInvoker(
    EmployeeController_1.listEmployees(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "listEmployees",
      Nil,
      "GET",
      this.prefix + """employee""",
      """ APIs in EmployeeController""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_EmployeeController_retrieve3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_retrieve3_invoker = createInvoker(
    EmployeeController_1.retrieve(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "retrieve",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_EmployeeController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_create4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_1.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_EmployeeController_update5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_update5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      EmployeeController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """employee""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_EmployeeController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_delete6_invoker = createInvoker(
    EmployeeController_1.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PatientController_listPatients7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_listPatients7_invoker = createInvoker(
    PatientController_0.listPatients(),
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

  // @LINE:20
  private[this] lazy val controllers_PatientController_retrieve8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_retrieve8_invoker = createInvoker(
    PatientController_0.retrieve(fakeValue[Int]),
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

  // @LINE:21
  private[this] lazy val controllers_PatientController_create9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_create9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PatientController_0.create(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:22
  private[this] lazy val controllers_PatientController_update10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_update10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      PatientController_0.update(fakeValue[play.mvc.Http.Request], fakeValue[Int]),
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

  // @LINE:23
  private[this] lazy val controllers_PatientController_delete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_delete11_invoker = createInvoker(
    PatientController_0.delete(fakeValue[Int]),
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

  // @LINE:25
  private[this] lazy val controllers_DroolsController_diagnosePatient12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true), StaticPart("/diagnose")))
  )
  private[this] lazy val controllers_DroolsController_diagnosePatient12_invoker = createInvoker(
    DroolsController_2.diagnosePatient(fakeValue[Int]),
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

  // @LINE:27
  private[this] lazy val controllers_PatientController_createPatientPrueba13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patient/instance")))
  )
  private[this] lazy val controllers_PatientController_createPatientPrueba13_invoker = createInvoker(
    PatientController_0.createPatientPrueba(),
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

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_HomeController_index0_invoker.call(HomeController_4.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_EmployeeController_listEmployees2_route(params@_) =>
      call { 
        controllers_EmployeeController_listEmployees2_invoker.call(EmployeeController_1.listEmployees())
      }
  
    // @LINE:13
    case controllers_EmployeeController_retrieve3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_EmployeeController_retrieve3_invoker.call(EmployeeController_1.retrieve(id))
      }
  
    // @LINE:14
    case controllers_EmployeeController_create4_route(params@_) =>
      call { 
        controllers_EmployeeController_create4_invoker.call(
          req => EmployeeController_1.create(req))
      }
  
    // @LINE:15
    case controllers_EmployeeController_update5_route(params@_) =>
      call { 
        controllers_EmployeeController_update5_invoker.call(
          req => EmployeeController_1.update(req))
      }
  
    // @LINE:16
    case controllers_EmployeeController_delete6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_EmployeeController_delete6_invoker.call(EmployeeController_1.delete(id))
      }
  
    // @LINE:19
    case controllers_PatientController_listPatients7_route(params@_) =>
      call { 
        controllers_PatientController_listPatients7_invoker.call(PatientController_0.listPatients())
      }
  
    // @LINE:20
    case controllers_PatientController_retrieve8_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_retrieve8_invoker.call(PatientController_0.retrieve(id))
      }
  
    // @LINE:21
    case controllers_PatientController_create9_route(params@_) =>
      call { 
        controllers_PatientController_create9_invoker.call(
          req => PatientController_0.create(req))
      }
  
    // @LINE:22
    case controllers_PatientController_update10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_update10_invoker.call(
          req => PatientController_0.update(req, id))
      }
  
    // @LINE:23
    case controllers_PatientController_delete11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PatientController_delete11_invoker.call(PatientController_0.delete(id))
      }
  
    // @LINE:25
    case controllers_DroolsController_diagnosePatient12_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_DroolsController_diagnosePatient12_invoker.call(DroolsController_2.diagnosePatient(id))
      }
  
    // @LINE:27
    case controllers_PatientController_createPatientPrueba13_route(params@_) =>
      call { 
        controllers_PatientController_createPatientPrueba13_invoker.call(PatientController_0.createPatientPrueba())
      }
  
    // @LINE:30
    case controllers_Assets_versioned14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
