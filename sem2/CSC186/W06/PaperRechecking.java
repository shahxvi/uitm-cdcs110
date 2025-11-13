public class PaperRechecking {
    /* Attributes */
    private String studentID;
    private String studentName;
    private String subjectCode;
    private int previousMark;
    private int newMark;

    /* Constructors */
    public PaperRechecking() {
        studentID = "";
        studentName = "";
        subjectCode = "";
        previousMark = 0;
        newMark = 0;
    }

    public PaperRechecking(String studentID, String studentName, String subjectCode, int previousMark, int newMark) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.subjectCode = subjectCode;
        this.previousMark = previousMark;
        this.newMark = newMark;
    }

    public PaperRechecking(PaperRechecking otherPaperRechecking) {
        otherPaperRechecking.studentID = studentID;
        otherPaperRechecking.studentName = studentName;
        otherPaperRechecking.subjectCode = subjectCode;
        otherPaperRechecking.previousMark = previousMark;
        otherPaperRechecking.newMark = newMark;
    }
    /* Constructors */

    /* Setters */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setPreviousMark(int previousMark) {
        this.previousMark = previousMark;
    }

    public void setNewMark(int newMark) {
        this.newMark = newMark;
    }
    /* Setters */

    /* Getters */
    public String setStudentID() {
        return studentID;
    }

    public String setStudentName() {
        return studentName;
    }

    public String setSubjectCode() {
        return subjectCode;
    }

    public int setPreviousMark() {
        return previousMark;
    }

    public int setNewMark() {
        return newMark;
    }
    /* Getters */

    /* Processors */
    public String displayChanges() {
        if (newMark < previousMark)
            return "The mark after recheck deducted " + (previousMark - newMark);
        else if (newMark > previousMark)
            return "The mark after recheck added " + (newMark - previousMark);
        else
            return "No changes of mark";
    }

    /* Printer */
    public String toString() {
        return "\nStudent ID: " + studentID +
                "\nStudent Name: " + studentName +
                "\nSubject Code: " + subjectCode +
                "\nPrevious Mark: " + previousMark +
                "\nNew Mark: " + newMark +
                "\n" + displayChanges();
    }
}
