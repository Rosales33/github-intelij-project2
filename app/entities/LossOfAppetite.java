package entities;

public class LossOfAppetite {
    private int patientId;
    private boolean lossOfAppetite;

    public LossOfAppetite(int patientId, boolean lossOfAppetite) {
        this.patientId = patientId;
        this.lossOfAppetite = lossOfAppetite;
    }

    public boolean isLossOfAppetite() {
        return lossOfAppetite;
    }

    public void setLossOfAppetite(boolean lossOfAppetite) {
        this.lossOfAppetite = lossOfAppetite;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
