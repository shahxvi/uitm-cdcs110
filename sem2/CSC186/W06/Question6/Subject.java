public class Subject {
    private String codeSubject;
    private String subjectName;
    private int creditHour;
    private String grade;

    public Subject(String codeSubject, String subjectName, int creditHour, String grade) {
        this.codeSubject = codeSubject;
        this.subjectName = subjectName;
        this.creditHour = creditHour;
        this.grade = grade;
    }

    public void setCodeSubject(String codeSubject) {
        this.codeSubject = codeSubject;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCodeSubject() {
        return codeSubject;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return String.format("%s\t\t\t%s\t\t%s", codeSubject, subjectName, grade);
    }
}
