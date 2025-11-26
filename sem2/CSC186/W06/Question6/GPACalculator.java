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

public class GPACalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Student[] student = new Student[1];
        Subject[] subject = new Subject[1];

        for (int i = 0; i < student.length; i++) {
            System.out.print("\nPlease enter your name: ");
            String name = keyboard.nextLine();

            System.out.print("Please enter your matrix number: ");
            int noMatrix = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Please enter your part / semester: ");
            int part = keyboard.nextInt();
            keyboard.nextLine();

            for (int j = 0; j < subject.length; j++) {
                System.out.print((j + 1) + "# Please enter your subject code: ");
                String codeSubject = keyboard.nextLine();

                System.out.print((j + 1) + "# Please enter your subject name: ");
                String subjectName = keyboard.nextLine();

                System.out.print((j + 1) + "# Please enter " + codeSubject + " credit hour: ");
                int creditHour = keyboard.nextInt();
                keyboard.nextLine();

                System.out.print((j + 1) + "# Please enter your grade: ");
                String grade = keyboard.nextLine();

                subject[j] = new Subject(codeSubject, subjectName, creditHour, grade);
            }
            student[i] = new Student(name, noMatrix, part, subject);
        }
        keyboard.close();

        for (int i = 0; i < subject.length; i++) {
            System.out.println(student[i]);
        }
    }
}
