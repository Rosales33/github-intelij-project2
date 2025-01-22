package entities;

public class Tachypnea {
    private int patientId;
    private boolean tachypnea;

    public Tachypnea(int patientId, boolean tachypnea) {
        this.patientId = patientId;
        this.tachypnea = tachypnea;
    }

    public boolean isTachypnea() {
        return tachypnea;
    }

    public void setTachypnea(boolean tachypnea) {
        this.tachypnea = tachypnea;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
