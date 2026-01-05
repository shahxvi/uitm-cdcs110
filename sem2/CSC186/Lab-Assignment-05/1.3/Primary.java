public class Primary extends Student {
    private int totalSubject; // Total subject registered for UPSR

    public Primary() {
        super();
        this.totalSubject = 0;
    }

    public Primary(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse, int totalSubject) {
        super(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse);
        this.totalSubject = totalSubject;
    }

    public Primary(Primary other) {
        super(other);
        this.totalSubject = other.totalSubject;
    }

    public void setTotalSubject(int totalSubject) {
        this.totalSubject = totalSubject;
    }

    public int getTotalSubject() {
        return totalSubject;
    }

    public double calculatePrimaryFees() {
        double fee = 0.00;
        for (int i = 0; i < totalSubject; i++) {
            fee += 50.00;
        }

        if (extraLanguage)
            fee += 100;

        if (computerCourse)
            fee += 150;

        return fee;
    }

    public String toString() {
        String str = super.toString();
        return str += "\nTotal Subject: " + totalSubject;
    }
}
