package entities;

public class SweatingOrChills {
    private int patientId;
    private boolean sweatingOrChills;

    public SweatingOrChills(boolean sweatingOrChills) {
        this.sweatingOrChills = sweatingOrChills;
    }

    public boolean isSweatingOrChills() {
        return sweatingOrChills;
    }

    public void setSweatingOrChills(boolean sweatingOrChills) {
        this.sweatingOrChills = sweatingOrChills;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
