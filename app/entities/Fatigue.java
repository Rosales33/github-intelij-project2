package entities;

public class Fatigue {
    private int patientId;
    private boolean fatigue;

    public Fatigue(int patientId, boolean fatigue) {
        this.patientId = patientId;
        this.fatigue = fatigue;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
