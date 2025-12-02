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
        int numberOfStudent;

        System.out.print("Enter the number of students: ");
        numberOfStudent = keyboard.nextInt();
        keyboard.nextLine();

        Student[] student = new Student[numberOfStudent];
        int[] totalCreditHours = new int[numberOfStudent];

        for (int i = 0; i < student.length; i++) {
            System.out.print("\nPlease enter your name: ");
            String name = keyboard.nextLine();

            System.out.print("Please enter your matrix number: ");
            int noMatrix = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Please enter your part / semester: ");
            int part = keyboard.nextInt();
            keyboard.nextLine();

            for (int j = 0; j < 6; j++) {
                System.out.print("\n" + (j + 1) + "# Please enter your subject code: ");
                String codeSubject = keyboard.nextLine();

                System.out.print((j + 1) + "# Please enter your subject name: ");
                String subjectName = keyboard.nextLine();

                System.out.print((j + 1) + "# Please enter " + codeSubject + " credit hour: ");
                int creditHour = keyboard.nextInt();
                keyboard.nextLine();
                totalCreditHours[i] += creditHour;

                System.out.print((j + 1) + "# Please enter your grade: ");
                String grade = keyboard.nextLine();

                student[i].getSubject()[j] = new Subject(codeSubject, subjectName, creditHour, grade);
            }
        }
        keyboard.close();

        // Output
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
            System.out.println("\nTotal Credit Hours: " + totalCreditHours[i]);
            System.out.printf("GPA : %.2f\n", student[i].calcGPA());
        }

        // Number of students who got GPA greater than 3.00
        int greaterThan3 = 0;
        for (Student s : student) {
            if (s.calcGPA() >= 3.00)
                greaterThan3++;
        }
        System.out.println("\nThe number of students who got GPA greater than 3.00: " + greaterThan3);

        // Display the number of students who got dean list
        int deanList = 0;
        for (Student s : student) {
            if (s.calcGPA() >= 3.67)
                deanList++;
        }
        System.out.println("\nThe number of students who got dean list: " + deanList);

        // Student with the highest GPA
        double highestGPA = -9.99;
        int index = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].calcGPA() > highestGPA) {
                highestGPA = student[i].calcGPA();
                index = i;
            }
        }
        System.out.println("\nThe student with the highest GPA");
        System.out.println("Name: " + student[index].getName());
        System.out.println("Matrix Number: " + student[index].getNoMatrix());
    }
}
