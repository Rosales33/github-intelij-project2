package entities;

public class Diagnose {
    private int patientId;
    private int score;
    private boolean pneumonia;
    private int scoreType;
    private Type type;
    private int scoreSeverity;
    private Severity severity;

    public Diagnose(int patientId) {
        this.patientId = patientId;
    }

    public Diagnose(int patientId, int score, boolean pneumonia, int scoreType, Type type) {
        this.patientId = patientId;
        this.score = score;
        this.pneumonia = pneumonia;
        this.scoreType = scoreType;
        this.type = type;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isPneumonia() {
        return pneumonia;
    }

    public void setPneumonia(boolean pneumonia) {
        this.pneumonia = pneumonia;
    }

    public int getScoreType() {
        return scoreType;
    }

    public void setScoreType(int scoreType) {
        this.scoreType = scoreType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getScoreSeverity() {
        return scoreSeverity;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setScoreSeverity(int scoreSeverity) {
        this.scoreSeverity = scoreSeverity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
