package entities;

public class Hypotension {
    private int patientId;
    private boolean hypotension;

    public Hypotension(boolean hypotension) {
        this.hypotension = hypotension;
    }

    public boolean isHypotension() {
        return hypotension;
    }

    public void setHypotension(boolean hypotension) {
        this.hypotension = hypotension;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
