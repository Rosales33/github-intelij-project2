package entities;

public class Myalgia {
    private int patientId;
    private boolean myalgia;

    public Myalgia(boolean myalgia) {
        this.myalgia = myalgia;
    }

    public boolean isMyalgia() {
        return myalgia;
    }

    public void setMyalgia(boolean myalgia) {
        this.myalgia = myalgia;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
