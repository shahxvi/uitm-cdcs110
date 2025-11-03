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
        // Attributes
        public String programCode;
        public String description;
        public int durationInYears;
        public String faculty;
        public String programHead;

        /* Constructors */
        // Default Constructor
        public Program() {
                programCode = "";
                description = "";
                durationInYears = 0;
                faculty = "";
                programHead = "";
        }

        // Normal Constructor
        public Program(String programCode, String description, int durationInYears, String faculty,
                        String programHead) {
                this.programCode = programCode;
                this.description = description;
                this.durationInYears = durationInYears;
                this.faculty = faculty;
                this.programHead = programHead;
        }

        // Copy Constructor
        public Program(Program otherProgram) {
                this.programCode = otherProgram.programCode;
                this.description = otherProgram.description;
                this.durationInYears = otherProgram.durationInYears;
                this.faculty = otherProgram.faculty;
                this.programHead = otherProgram.programHead;
        }
        /* Constructors */

        /* Setters */
        public void setProgramCode(String programCode) {
                this.programCode = programCode;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public void setdurationInYears(int durationInYears) {
                this.durationInYears = durationInYears;
        }

        public void setFaculty(String faculty) {
                this.faculty = faculty;
        }

        public void setProgramHead(String programHead) {
                this.programHead = programHead;
        }
        /* Setters */

        /* Getters */
        public String getProgramCode() {
                return programCode;
        }

        public String getDescription() {
                return description;
        }

        public int getdurationInYears() {
                return durationInYears;
        }

        public String getFaculty() {
                return faculty;
        }

        public String getProgramHead() {
                return programHead;
        }
        /* Getters */

        // Processor
        public String determineProgramLevel() {
                int firstNumber = 9;

                for (int i = 0; i < programCode.length(); i++) {
                        if (Character.isDigit(programCode.charAt(i))) {
                                firstNumber = Character.getNumericValue(programCode.charAt(i));
                                break;
                        }
                }

                // Determine program level and return it
                switch (firstNumber) {
                        case 0:
                                return "Certificate";
                        case 1:
                                return "Diploma";
                        case 2:
                                return "Degree";
                        case 7:
                                return "Master";
                        case 9:
                                return "Doctorate";
                        default:
                                return "Unknown - Could Not Determine Program Level";
                }
        }

        // Printer
        public String toString() {
                return "\nProgram Code:\t\t" + programCode +
                                "\nDescription:\t\t" + description +
                                "\nDuration (Years):\t" + durationInYears +
                                "\nFaculty:\t\t" + faculty +
                                "\nProgram Head:\t\t" + programHead +
                                "\nProgram Level:\t\t" + determineProgramLevel();
        }
}
