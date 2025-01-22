package entities;

public class Fever {
    private int patientId;
    private boolean fever;
    private boolean elevatedFever;

    public Fever() {
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean getElevatedFever() {
        return elevatedFever;
    }

    public void setElevatedFever(boolean elevatedFever) {
        this.elevatedFever = elevatedFever;
    }
}
