package entities;

public class Confusion {
    private int patientId;
    private boolean confusion;

    public Confusion(int patientId, boolean confusion) {
        this.patientId = patientId;
        this.confusion = confusion;
    }

    public boolean isConfusion() {
        return confusion;
    }

    public void setConfusion(boolean confusion) {
        this.confusion = confusion;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
