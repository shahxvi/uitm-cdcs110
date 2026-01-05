public class Secondary extends Student {
    private int level;  //three levels being offered
                        // 1 -> PMR, 2 -> SPM, 3 -> STPM
    public Secondary() {
        super();
        this.level = 0;
    }

    public Secondary(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse, int level) {
        super(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse);
        this.level = level;
    }

    public Secondary(Secondary other) {
        super(other);
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public double calculateSecondaryFees() {
        double fee = 0.00;
        switch (level) {
            case 1: // PMR
                fee = 50.00;
                break;
            case 2: // SPM
                fee = 150.00;
                break;
            case 3: // STPM
                fee = 200.00;
                break;
        }

        if (extraLanguage)
            fee += 100.00;

        if (computerCourse)
            fee += 150.00;

        return fee;
    }

    public String toString() {
        String str = super.toString();
        return str += "\nLevel: " + level;
    }
}
