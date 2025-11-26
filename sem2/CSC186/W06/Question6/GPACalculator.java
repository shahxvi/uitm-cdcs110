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
