package entities;

public class Uremia {
    private int patientId;
    private boolean uremia;

    public Uremia(boolean uremia) {
        this.uremia = uremia;
    }

    public boolean isUremia() {
        return uremia;
    }

    public void setUremia(boolean uremia) {
        this.uremia = uremia;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
