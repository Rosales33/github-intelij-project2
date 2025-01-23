package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.FullPatient;
import entities.Progression;
import entities.Sex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.PatientService;
import utils.ApplicationUtil;
import java.util.Set;

public class PatientController extends Controller{

    private static final Logger logger = LoggerFactory.getLogger("controller");

    public Result create(Http.Request request) {
        JsonNode json = request.body().asJson();
        if (json == null) {
            return badRequest(ApplicationUtil.createResponse("Expecting JSON data", false));
        }
        logger.debug("In PatientController.create(), input is: {}", json.toString());
        FullPatient patient = PatientService.getInstance().addPatient(Json.fromJson(json, FullPatient.class));
        JsonNode jsonObject = Json.toJson(patient);
        return created(ApplicationUtil.createResponse(jsonObject, true));
    }

    public Result update(Http.Request request, int id) {
        logger.debug("In PatientController.update()");
        JsonNode json = request.body().asJson();
        if (json == null) {
            return badRequest(ApplicationUtil.createResponse("Expecting Json data", false));
        }
        FullPatient patient = PatientService.getInstance().updatePatient(Json.fromJson(json, FullPatient.class), id);
        logger.debug("In PatientController.update(), patient is: {}",patient);
        if (patient == null) {
            return notFound(ApplicationUtil.createResponse("Employee not found", false));
        }

        JsonNode jsonObject = Json.toJson(patient);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }

    public Result retrieve(int id) {
        logger.debug("In PatientController.retrieve(), retrieve patient with id: {}",id);
        if (PatientService.getInstance().getPatient(id) == null) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }
        JsonNode jsonObjects = Json.toJson(PatientService.getInstance().getPatient(id));
        logger.debug("In PatientController.retrieve(), result is: {}",jsonObjects.toString());
        return ok(ApplicationUtil.createResponse(jsonObjects, true));
    }

    public Result listPatients() {
        Set<FullPatient> result = PatientService.getInstance().getAllPatients();
        logger.debug("In PatientController.listPatients(), result is: {}",result.toString());
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
        return ok(ApplicationUtil.createResponse(jsonData, true));

    }

    public Result delete(int id) {
        logger.debug("In PatientController.retrieve(), delete patient with id: {}",id);
        if (!PatientService.getInstance().deletePatient(id)) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }
        return ok(ApplicationUtil.createResponse("Patient with id:" + id + " deleted", true));
    }

    public Result createPatientPrueba() {
        FullPatient patient = new FullPatient(1,82, Sex.FEMALE,39,true,true,true,true,true,true, Progression.RAPID,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true);
        JsonNode jsonObject = Json.toJson(patient);
        return created(ApplicationUtil.createResponse(jsonObject, true));
    }
}
