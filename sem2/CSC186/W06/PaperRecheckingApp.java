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

import java.util.Scanner;

public class PaperRecheckingApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PaperRechecking[] pRechecking = new PaperRechecking[100];

        for (int i = 0; i < pRechecking.length; i++) {
            pRechecking[i] = new PaperRechecking();

            System.out.print("\nEnter your student ID: ");
            pRechecking[i].setStudentID(keyboard.nextLine());

            System.out.print("Enter your name: ");
            pRechecking[i].setStudentName(keyboard.nextLine());

            System.out.print("Enter your subject code: ");
            pRechecking[i].setSubjectCode(keyboard.nextLine());

            System.out.print("Enter your current marks: ");
            pRechecking[i].setPreviousMark(keyboard.nextInt());
            keyboard.nextLine();

            System.out.print("Enter your new marks: ");
            pRechecking[i].setNewMark(keyboard.nextInt());
            keyboard.nextLine();

            System.out.println(pRechecking[i]);
        }

        System.out.println(
                "Number of students with the same marks after rechecking: " + studentsWithTheSameMarks(pRechecking));

        keyboard.close();
    }

    public static int studentsWithTheSameMarks(PaperRechecking[] paperRechecking) {
        int studentsWithTheSameMarks = 0;
        for (PaperRechecking p : paperRechecking) {
            if (p.setPreviousMark() == p.setNewMark()) {
                studentsWithTheSameMarks++;
            }
        }
        return studentsWithTheSameMarks;
    }
}
