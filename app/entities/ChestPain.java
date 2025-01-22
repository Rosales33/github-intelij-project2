package entities;

public class ChestPain {
    private int patientId;
    private boolean chestPain;

    public ChestPain(int patientId, boolean chestPain) {
        this.patientId = patientId;
        this.chestPain = chestPain;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
