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
