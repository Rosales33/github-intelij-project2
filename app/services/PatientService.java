package services;

import entities.FullPatient;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PatientService {

    private static PatientService instance;
    private Map<Integer, FullPatient> patients = new HashMap<>();

    public static PatientService getInstance() {
        if (instance == null) {
            instance = new PatientService();
        }
        return instance;
    }

    public FullPatient addPatient(FullPatient patient) {
        int id = patients.size()+1;
        patient.setId(id);
        patients.put(id, patient);
        return patient;
    }

    public FullPatient getPatient(int id) {
        return patients.get(id);
    }

    public Set<FullPatient> getAllPatients() {
        return new HashSet<>(patients.values());
    }

    public FullPatient updatePatient(FullPatient patient) {
        int id = patient.getId();
        if (patients.containsKey(id)) {
            patients.put(id, patient);
            return patient;
        }
        return null;
    }

    public boolean deletePatient(int id) {
        return patients.remove(id) != null;
    }
}
