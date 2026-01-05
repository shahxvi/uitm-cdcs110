public class Student {
    protected String studentID; // student ID
    protected String studentName; // student name
    protected int age; // student age
    protected String nameOfSchool; // school name
    protected boolean extraLanguage; // need for extra language, eg: Arabic or Mandarin but this is optional for student to learn extra language
    protected boolean computerCourse; // need for computer course, but this is optional for student to learn on extra computer software

    public Student() {
        this.studentID = "";
        this.studentName = "";
        this.age = 0;
        this.nameOfSchool = "";
        this.extraLanguage = false;
        this.computerCourse = false;
    }

    public Student(String studentID, String studentName, int age, String nameOfSchool, boolean extraLanguage, boolean computerCourse) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.nameOfSchool = nameOfSchool;
        this.extraLanguage = extraLanguage;
        this.computerCourse = computerCourse;
    }

    public Student(Student other) {
        this.studentID = other.studentID;
        this.studentName = other.studentName;
        this.age = other.age;
        this.nameOfSchool = other.nameOfSchool;
        this.extraLanguage = other.extraLanguage;
        this.computerCourse = other.computerCourse;
    }

    /* Setters */
    public void setStudentID(String studentid) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public void setExtraLanguage(boolean extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public void setComputerCourse(boolean computerCourse) {
        this.computerCourse = computerCourse;
    }
    /* Setters */

    /* Getters */
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public boolean getExtraLanguage() {
        return extraLanguage;
    }

    public boolean getComputerCourse() {
        return computerCourse;
    }

    public String toString() {
        String str = "Student ID: " + studentID +
                     "\nStudent Name: " + studentName + 
                     "\nAge: " + age +
                     "\nName of School: " + nameOfSchool +
                     "\nExtra Language: " + extraLanguage +
                     "\nComputer Course: " + computerCourse;
        return str;
    }
}
