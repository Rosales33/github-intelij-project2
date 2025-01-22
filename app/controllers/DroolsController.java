package controllers;

import entities.FullPatient;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.PatientService;
import utils.ApplicationUtil;
import play.mvc.Controller;
import play.mvc.Result;
import entities.*;

public class DroolsController extends Controller {

    //private static final Logger logger = LoggerFactory.getLogger("controller");

    public Result diagnosePatient(int id) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        FullPatient patient = PatientService.getInstance().getPatient(id);
        if (patient == null) {
            return notFound(ApplicationUtil.createResponse("Patient not found", false));
        }

        execute(kc);

        return ok(ApplicationUtil.createResponse(patient, true));
    }

    public static void execute(KieContainer kc) {
        // From the container, a session is created based on
        // its definition and configuration in the META-INF/kmodule.xml file
        KieSession ksession = kc.newKieSession("pneumoniaKS");

        // Once the session is created, the application can interact with it

        FullPatient patient = new FullPatient(1,80, FullPatient.Sex.FEMALE,38,true, true, true, true, true, true, FullPatient.Progression.RAPID, true);
        FullPatient patient2 = new FullPatient(2,44, FullPatient.Sex.MALE,36,false, false, false, false, false, false, FullPatient.Progression.GRADUAL, false);

        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );
        // The application can insert facts into the session

        // and fire the rules
        ksession.fireAllRules();

        // and then dispose the session
        ksession.dispose();
    }
}
