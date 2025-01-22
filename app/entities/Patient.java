package entities;

public class Patient {
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

        public Patient(int id, int age, Sex sex, int temperature, boolean neurologicalConditionAffectingSwallowing, boolean underlyingHeartOrPulmonaryConditions, boolean hospitalized, boolean smoker, boolean pregnant, boolean weakenedInmuneSystem, Progression progression, boolean progressiveRespiratoryDistress) {
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
}
