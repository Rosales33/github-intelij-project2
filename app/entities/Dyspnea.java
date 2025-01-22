package entities;

public class Dyspnea {
    private int patientId;
    private boolean dyspnea;

    public Dyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public boolean isDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
