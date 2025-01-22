package entities;

public class Tachycardia {
    private int patientId;
    private boolean tachycardia;

    public Tachycardia(int patientId, boolean tachycardia) {
        this.patientId = patientId;
        this.tachycardia = tachycardia;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
