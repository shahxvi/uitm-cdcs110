import java.util.Scanner;

public class PaperRecheckingApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size = 100;
        PaperRechecking[] pRechecking = new PaperRechecking[size];

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
