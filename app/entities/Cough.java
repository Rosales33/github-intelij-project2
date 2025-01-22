package entities;

public class Cough {
    private int patientId;
    private boolean cough;
    private boolean productive;
    private boolean foulSmellingOrPorulentSputum;

    public Cough(boolean cough, boolean productive, boolean foulSmellingOrPorulentSputum) {
        this.cough = cough;
        this.productive = productive;
        this.foulSmellingOrPorulentSputum = foulSmellingOrPorulentSputum;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public boolean getProductive() {
        return productive;
    }

    public void setProductive(boolean productive) {
        this.productive = productive;
    }

    public boolean isFoulSmellingOrPorulentSputum() {
        return foulSmellingOrPorulentSputum;
    }

    public void setFoulSmellingOrPorulentSputum(boolean foulSmellingOrPorulentSputum) {
        this.foulSmellingOrPorulentSputum = foulSmellingOrPorulentSputum;
    }
}
