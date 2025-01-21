package controllers;

import play.mvc.Controller;

public class DroolsController extends Controller {
    /*public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        execute(ks, kc);
    }

    public static void execute(KieServices ks, KieContainer kc) {
        // From the container, a session is created based on
        // its definition and configuration in the META-INF/kmodule.xml file
        KieSession ksession = kc.newKieSession("pneumoniaKS");

        // Once the session is created, the application can interact with it


        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );
        // The application can insert facts into the session

        Patient patient = new Patient(1, 78, Patient.Sex.FEMALE, 38, true, true, true, true, true, true, Patient.Progression.RAPID, true);
        Diagnose diagnose = new Diagnose(patient.getId());

        Fever fever = new Fever();
        fever.setPatientId(patient.getId());

        Cough cough = new Cough(true, true, true);
        cough.setPatientId(patient.getId());

        Cyanosis cyanosis = new Cyanosis(true);
        cyanosis.setPatientId(patient.getId());

        Dyspnea dyspnea = new Dyspnea(true);
        dyspnea.setPatientId(patient.getId());

        Fatigue fatigue = new Fatigue(true);
        fatigue.setPatientId(patient.getId());

        LossOfAppetite lossOfAppetite = new LossOfAppetite(true);
        lossOfAppetite.setPatientId(patient.getId());

        SweatingOrChills sweatingOrChills = new SweatingOrChills(true);
        sweatingOrChills.setPatientId(patient.getId());

        Tachycardia tachycardia = new Tachycardia(true);
        tachycardia.setPatientId(patient.getId());

        ChestPain chestPain = new ChestPain(true);
        chestPain.setPatientId(patient.getId());

        Confusion confusion = new Confusion(true);
        confusion.setPatientId(patient.getId());

        Myalgia myalgia = new Myalgia(true);
        myalgia.setPatientId(patient.getId());

        Uremia uremia = new Uremia(false);
        uremia.setPatientId(patient.getId());

        Tachypnea tachypnea = new Tachypnea(false);
        tachypnea.setPatientId(patient.getId());

        Hypotension hypotension = new Hypotension(false);
        hypotension.setPatientId(patient.getId());

        ksession.insert(patient);
        ksession.insert(diagnose);
        ksession.insert(fever);
        ksession.insert(cough);
        ksession.insert(cyanosis);
        ksession.insert(dyspnea);
        ksession.insert(fatigue);
        ksession.insert(lossOfAppetite);
        ksession.insert(sweatingOrChills);
        ksession.insert(tachycardia);
        ksession.insert(chestPain);
        ksession.insert(confusion);
        ksession.insert(myalgia);
        ksession.insert(uremia);
        ksession.insert(tachypnea);
        ksession.insert(hypotension);


        // and fire the rules
        ksession.fireAllRules();

        System.out.println("Final score for patient " + diagnose.getPatientId() + ": " + diagnose.getScore());
        System.out.println("Pneumonia: " + diagnose.isPneumonia());
        System.out.println("Final score type for patient " + diagnose.getPatientId() + ": " + diagnose.getScoreType());
        System.out.println("Type: " + diagnose.getType());
        System.out.println("Final score severity for patient " + diagnose.getPatientId() + ": " + diagnose.getScoreSeverity());
        System.out.println("Type: " + diagnose.getSeverity());

        // and then dispose the session
        ksession.dispose();
    }*/
}
