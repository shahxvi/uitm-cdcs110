/* MIT License
 * Copyright (c) <2025> <Shah> <2025171523@student.uitm.edu.my>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in shall
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. */

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
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public int getPreviousMark() {
        return previousMark;
    }

    public int getNewMark() {
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
