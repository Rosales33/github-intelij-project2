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
    private int score;
    private boolean pneumonia;
    private int scoreType;
    private Type type;
    private int scoreSeverity;
    private Severity severity;

    public FullPatient() {
    }

    public FullPatient(int id, int age, Sex sex, int temperature, boolean neurologicalConditionAffectingSwallowing, boolean underlyingHeartOrPulmonaryConditions, boolean hospitalized, boolean smoker, boolean pregnant, boolean weakenedInmuneSystem, Progression progression, boolean progressiveRespiratoryDistress, boolean chestPain, boolean confusion, boolean cough, boolean productive, boolean foulSmellingOrPorulentSputum, boolean cyanosis, boolean dyspnea, boolean fatigue, boolean fever, boolean elevatedFever, boolean hypotension, boolean lossOfAppetite, boolean myalgia, boolean sweatingOrChills, boolean tachycardia, boolean tachypnea, boolean uremia) {
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
        this.chestPain = chestPain;
        this.confusion = confusion;
        this.cough = cough;
        this.productive = productive;
        this.foulSmellingOrPorulentSputum = foulSmellingOrPorulentSputum;
        this.cyanosis = cyanosis;
        this.dyspnea = dyspnea;
        this.fatigue = fatigue;
        this.fever = fever;
        this.elevatedFever = elevatedFever;
        this.hypotension = hypotension;
        this.lossOfAppetite = lossOfAppetite;
        this.myalgia = myalgia;
        this.sweatingOrChills = sweatingOrChills;
        this.tachycardia = tachycardia;
        this.tachypnea = tachypnea;
        this.uremia = uremia;
    }

    public FullPatient(int age, Sex sex, int temperature, boolean neurologicalConditionAffectingSwallowing, boolean underlyingHeartOrPulmonaryConditions, boolean hospitalized, boolean smoker, boolean pregnant, boolean weakenedInmuneSystem, Progression progression, boolean progressiveRespiratoryDistress, boolean chestPain, boolean confusion, boolean cough, boolean productive, boolean foulSmellingOrPorulentSputum, boolean cyanosis, boolean dyspnea, boolean fatigue, boolean fever, boolean elevatedFever, boolean hypotension, boolean lossOfAppetite, boolean myalgia, boolean sweatingOrChills, boolean tachycardia, boolean tachypnea, boolean uremia) {
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
        this.chestPain = chestPain;
        this.confusion = confusion;
        this.cough = cough;
        this.productive = productive;
        this.foulSmellingOrPorulentSputum = foulSmellingOrPorulentSputum;
        this.cyanosis = cyanosis;
        this.dyspnea = dyspnea;
        this.fatigue = fatigue;
        this.fever = fever;
        this.elevatedFever = elevatedFever;
        this.hypotension = hypotension;
        this.lossOfAppetite = lossOfAppetite;
        this.myalgia = myalgia;
        this.sweatingOrChills = sweatingOrChills;
        this.tachycardia = tachycardia;
        this.tachypnea = tachypnea;
        this.uremia = uremia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isNeurologicalConditionAffectingSwallowing() {
        return neurologicalConditionAffectingSwallowing;
    }

    public void setNeurologicalConditionAffectingSwallowing(boolean neurologicalConditionAffectingSwallowing) {
        this.neurologicalConditionAffectingSwallowing = neurologicalConditionAffectingSwallowing;
    }

    public boolean isUnderlyingHeartOrPulmonaryConditions() {
        return underlyingHeartOrPulmonaryConditions;
    }

    public void setUnderlyingHeartOrPulmonaryConditions(boolean underlyingHeartOrPulmonaryConditions) {
        this.underlyingHeartOrPulmonaryConditions = underlyingHeartOrPulmonaryConditions;
    }

    public boolean isHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public boolean isWeakenedInmuneSystem() {
        return weakenedInmuneSystem;
    }

    public void setWeakenedInmuneSystem(boolean weakenedInmuneSystem) {
        this.weakenedInmuneSystem = weakenedInmuneSystem;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

    public boolean isProgressiveRespiratoryDistress() {
        return progressiveRespiratoryDistress;
    }

    public void setProgressiveRespiratoryDistress(boolean progressiveRespiratoryDistress) {
        this.progressiveRespiratoryDistress = progressiveRespiratoryDistress;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public boolean isConfusion() {
        return confusion;
    }

    public void setConfusion(boolean confusion) {
        this.confusion = confusion;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isProductive() {
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

    public boolean isCyanosis() {
        return cyanosis;
    }

    public void setCyanosis(boolean cyanosis) {
        this.cyanosis = cyanosis;
    }

    public boolean isDyspnea() {
        return dyspnea;
    }

    public void setDyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isElevatedFever() {
        return elevatedFever;
    }

    public void setElevatedFever(boolean elevatedFever) {
        this.elevatedFever = elevatedFever;
    }

    public boolean isHypotension() {
        return hypotension;
    }

    public void setHypotension(boolean hypotension) {
        this.hypotension = hypotension;
    }

    public boolean isLossOfAppetite() {
        return lossOfAppetite;
    }

    public void setLossOfAppetite(boolean lossOfAppetite) {
        this.lossOfAppetite = lossOfAppetite;
    }

    public boolean isMyalgia() {
        return myalgia;
    }

    public void setMyalgia(boolean myalgia) {
        this.myalgia = myalgia;
    }

    public boolean isSweatingOrChills() {
        return sweatingOrChills;
    }

    public void setSweatingOrChills(boolean sweatingOrChills) {
        this.sweatingOrChills = sweatingOrChills;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    public boolean isTachypnea() {
        return tachypnea;
    }

    public void setTachypnea(boolean tachypnea) {
        this.tachypnea = tachypnea;
    }

    public boolean isUremia() {
        return uremia;
    }

    public void setUremia(boolean uremia) {
        this.uremia = uremia;
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

    public void setScoreSeverity(int scoreSeverity) {
        this.scoreSeverity = scoreSeverity;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
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
                ", score=" + score +
                ", pneumonia=" + pneumonia +
                ", scoreType=" + scoreType +
                ", type=" + type +
                ", scoreSeverity=" + scoreSeverity +
                ", severity=" + severity +
                '}';
    }
}
