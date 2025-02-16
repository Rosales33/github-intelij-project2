// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePatientController PatientController = new controllers.ReversePatientController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDroolsController DroolsController = new controllers.ReverseDroolsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePatientController PatientController = new controllers.javascript.ReversePatientController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDroolsController DroolsController = new controllers.javascript.ReverseDroolsController(RoutesPrefix.byNamePrefix());
  }

}
