package entities;

public class FullPatient {
    //Patient attributes
    private int id;
    private int age;
    private Sex sex;
    private int temperature;
    private boolean neurologicalConditionAffectingSwallowing;
    private boolean underlyingHeartOrPulmonaryConditions;
    private boolean hospitalized;
    private boolean smoker;
    private boolean pregnant;
    private boolean weakenedInmuneSystem;
    private Progression progression;
    private boolean progressiveRespiratoryDistress;
    //Symptoms
    private boolean chestPain;
    private boolean confusion;
    private boolean cough;
    private boolean productive;
    private boolean foulSmellingOrPorulentSputum;
    private boolean cyanosis;
    private boolean dyspnea;
    private boolean fatigue;
    private boolean fever;
    private boolean elevatedFever;
    private boolean hypotension;
    private boolean lossOfAppetite;
    private boolean myalgia;
    private boolean sweatingOrChills;
    private boolean tachycardia;
    private boolean tachypnea;
    private boolean uremia;
    //Diagnose attributes
    private int patientId;
    private int score;
    private boolean pneumonia;
    private int scoreType;
    private Type type;
    private int scoreSeverity;
    private Severity severity;

    public FullPatient(int id, int age, Sex sex, int temperature, boolean neurologicalConditionAffectingSwallowing, boolean underlyingHeartOrPulmonaryConditions, boolean hospitalized, boolean smoker, boolean pregnant, boolean weakenedInmuneSystem, Progression progression, boolean progressiveRespiratoryDistress) {
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.temperature = temperature;
        this.neurologicalConditionAffectingSwallowing = neurologicalConditionAffectingSwallowing;
        this.underlyingHeartOrPulmonaryConditions = underlyingHeartOrPulmonaryConditions;
        this.hospitalized = hospitalized;
        this.smoker = smoker;
        this.pregnant = pregnant;
        this.weakenedInmuneSystem = weakenedInmuneSystem;
        this.progression = progression;
        this.progressiveRespiratoryDistress = progressiveRespiratoryDistress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum Sex{
        MALE, FEMALE;
    }

    public enum Progression{
        RAPID, GRADUAL;
    }

    public enum Type{
        BACTERIAL, VIRAL;
    }

    public enum Severity{
        HIGH, MEDIUM, LOW;
    }

    @Override
    public String toString() {
        return "FullPatient{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                ", temperature=" + temperature +
                ", neurologicalConditionAffectingSwallowing=" + neurologicalConditionAffectingSwallowing +
                ", underlyingHeartOrPulmonaryConditions=" + underlyingHeartOrPulmonaryConditions +
                ", hospitalized=" + hospitalized +
                ", smoker=" + smoker +
                ", pregnant=" + pregnant +
                ", weakenedInmuneSystem=" + weakenedInmuneSystem +
                ", progression=" + progression +
                ", progressiveRespiratoryDistress=" + progressiveRespiratoryDistress +
                ", chestPain=" + chestPain +
                ", confusion=" + confusion +
                ", cough=" + cough +
                ", productive=" + productive +
                ", foulSmellingOrPorulentSputum=" + foulSmellingOrPorulentSputum +
                ", cyanosis=" + cyanosis +
                ", dyspnea=" + dyspnea +
                ", fatigue=" + fatigue +
                ", fever=" + fever +
                ", elevatedFever=" + elevatedFever +
                ", hypotension=" + hypotension +
                ", lossOfAppetite=" + lossOfAppetite +
                ", myalgia=" + myalgia +
                ", sweatingOrChills=" + sweatingOrChills +
                ", tachycardia=" + tachycardia +
                ", tachypnea=" + tachypnea +
                ", uremia=" + uremia +
                ", patientId=" + patientId +
                ", score=" + score +
                ", pneumonia=" + pneumonia +
                ", scoreType=" + scoreType +
                ", type=" + type +
                ", scoreSeverity=" + scoreSeverity +
                ", severity=" + severity +
                '}';
    }
}
