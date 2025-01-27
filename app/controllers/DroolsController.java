package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import entities.FullPatient;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import services.DroolsService;
import services.PatientService;
import utils.ApplicationUtil;
import play.mvc.Controller;
import play.mvc.Result;
import entities.*;

public class DroolsController extends Controller {

    public Result diagnosePatient(int id) {
        //KieServices ks = KieServices.Factory.get();
        //KieContainer kc = ks.getKieClasspathContainer();
        FullPatient fullPatient = PatientService.getInstance().getPatient(id); //transformar a patient

        if (fullPatient == null) {
            return notFound(ApplicationUtil.createResponse("Patient not found", false));
        }

        Patient patient = new Patient(fullPatient.getId(), fullPatient.getAge(), fullPatient.getSex(), fullPatient.getTemperature(), fullPatient.isNeurologicalConditionAffectingSwallowing(), fullPatient.isUnderlyingHeartOrPulmonaryConditions(), fullPatient.isHospitalized(), fullPatient.isSmoker(), fullPatient.isPregnant(), fullPatient.isWeakenedInmuneSystem(), fullPatient.getProgression(), fullPatient.isProgressiveRespiratoryDistress());

        Diagnose diagnose = new Diagnose(fullPatient.getId());

        Fever fever = new Fever(fullPatient.getId());
        Cough cough = new Cough(fullPatient.getId(),fullPatient.isCough(), fullPatient.isProductive(), fullPatient.isFoulSmellingOrPorulentSputum());
        Cyanosis cyanosis = new Cyanosis(fullPatient.getId(), fullPatient.isCyanosis());
        Dyspnea dyspnea = new Dyspnea(fullPatient.getId(), fullPatient.isDyspnea());
        Fatigue fatigue = new Fatigue(fullPatient.getId(), fullPatient.isFatigue());
        LossOfAppetite lossOfAppetite = new LossOfAppetite(fullPatient.getId(), fullPatient.isLossOfAppetite());
        SweatingOrChills sweatingOrChills = new SweatingOrChills(fullPatient.getId(), fullPatient.isSweatingOrChills());
        Tachycardia tachycardia = new Tachycardia(fullPatient.getId(), fullPatient.isTachycardia());
        ChestPain chestPain = new ChestPain(fullPatient.getId(), fullPatient.isChestPain());
        Confusion confusion = new Confusion(fullPatient.getId(), fullPatient.isConfusion());
        Myalgia myalgia = new Myalgia(fullPatient.getId(), fullPatient.isMyalgia());
        Uremia uremia = new Uremia(fullPatient.getId(), fullPatient.isUremia());
        Tachypnea tachypnea = new Tachypnea(fullPatient.getId(), fullPatient.isTachypnea());
        Hypotension hypotension = new Hypotension(fullPatient.getId(), fullPatient.isHypotension());

        //KieSession ksession = kc.newKieSession("pneumoniaKS");
        KieSession ksession = DroolsService.getInstance();

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

        ksession.fireAllRules();
        ksession.dispose();

        fullPatient.setFever(fever.isFever());
        fullPatient.setElevatedFever(fever.getElevatedFever());

        //añadir los atributos de diagonse a full patient y actualizarlo (update)
        fullPatient.setScore(diagnose.getScore());
        fullPatient.setPneumonia(diagnose.isPneumonia());
        fullPatient.setScoreSeverity(diagnose.getScoreSeverity());
        fullPatient.setSeverity(diagnose.getSeverity());
        fullPatient.setScoreType(diagnose.getScoreType());
        fullPatient.setType(diagnose.getType());

        FullPatient fullPatientWithEverything = PatientService.getInstance().updatePatient(fullPatient, id);

        JsonNode jsonObject = Json.toJson(fullPatientWithEverything);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }
}
