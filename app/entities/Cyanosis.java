package entities;

public class Cyanosis {
    private int patientId;
    private boolean cyanosis;

    public Cyanosis(boolean cyanosis) {
        this.cyanosis = cyanosis;
    }

    public boolean isCyanosis() {
        return cyanosis;
    }

    public void setCyanosis(boolean cyanosis) {
        this.cyanosis = cyanosis;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
