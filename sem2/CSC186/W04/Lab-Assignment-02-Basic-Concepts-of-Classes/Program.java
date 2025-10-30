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

public class Program {
        public String programCode;
        public String description;
        public String duration;
        public String faculty;
        public String programHead;

        public Program() {
                programCode = "";
                description = "";
                duration = "";
                faculty = "";
                programHead = "";
        }

        public Program(String programCode, String description, String duration, String faculty, String programHead) {
                this.programCode = programCode;
                this.description = description;
                this.duration = duration;
                this.faculty = faculty;
                this.programHead = programHead;
        }

        public Program(Program otherProgram) {
                this.programCode = otherProgram.programCode;
                this.description = otherProgram.description;
                this.duration = otherProgram.duration;
                this.faculty = otherProgram.faculty;
                this.programHead = otherProgram.programHead;
        }

        // Setters
        public void setProgramCode(String programCode) {
                this.programCode = programCode;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }

        public void setFaculty(String faculty) {
                this.faculty = faculty;
        }

        public void setProgramHead(String programHead) {
                this.programHead = programHead;
        }

        // Getters
        public String getProgramCode() {
                return programCode;
        }

        public String getDescription() {
                return description;
        }

        public String getDuration() {
                return duration;
        }

        public String getFaculty() {
                return faculty;
        }

        public String getProgramHead() {
                return programHead;
        }

        // Processor
        public String getProgramLevel() {
                if (programCode.charAt(2) == '0')
                        return "Certificate";
                else if (programCode.charAt(2) == '1')
                        return "Diploma";
                else if (programCode.charAt(2) == '2')
                        return "Degree";
                else if (programCode.charAt(2) == '7')
                        return "Master";
                else if (programCode.charAt(2) == '9')
                        return "Doctorate";
                else
                        return "";
        }

        // Printer
        public String toString() {
                String str = "\nProgram Code:\t" + programCode +
                                "\nDescription:\t" + description +
                                "\nDuration:\t" + duration +
                                "\nFaculty:\t" + faculty +
                                "\nProgram Head:\t" + programHead +
                                "\nProgram Level:\t" + getProgramLevel();
                return str;
        }
}
