import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat;

        Student[] students = new Student[50];
        int index = 0;
        do {
            int option;
            System.out.println("\n1 - Primary School (UPSR)");
            System.out.println("2 - Secondary School (PMR, SPM, STPM)");

            do {
                System.out.print("Please enter your education level (1 / 2): ");
                option = keyboard.nextInt();
                keyboard.nextLine();
            } while (option < 1 ||  option > 2);
            
            boolean primary = (option == 1);
            boolean secondary = (option == 2);

            System.out.print("\nPlease enter your student ID: ");
            String studentID = keyboard.nextLine();

            System.out.print("Please enter your name: ");
            String studentName = keyboard.nextLine();

            System.out.print("Please enter your age: ");
            int age = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Please enter your school name: ");
            String nameOfSchool = keyboard.nextLine();

            System.out.print("Would you like to take on extra languages? (Y/N): ");
            boolean extraLanguage = (keyboard.next().toUpperCase().charAt(0)) == 'Y';
            keyboard.nextLine();

            System.out.print("Would you like to take extra computer course? (Y/N): ");
            boolean computerCourse = (keyboard.next().toUpperCase().charAt(0)) == 'Y';
            keyboard.nextLine();

            if (primary) {
                System.out.print("Please enter the number of total subjects: ");
                int totalSubject = keyboard.nextInt();
                keyboard.nextLine();
                
                students[index++] = new Primary(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse, totalSubject);
            } else if (secondary) {
                int level;
                System.out.println("\n1 - PMR");
                System.out.println("2 - SPM");
                System.out.println("3 - STPM");
                do {
                    System.out.print("Please enter your level: ");
                    level = keyboard.nextInt();
                    keyboard.nextLine();
                } while (level < 1 || level > 3);

                students[index++] = new Secondary(studentID, studentName, age, nameOfSchool, extraLanguage, computerCourse, level);
            }

            System.out.print("Continue for another student? (Y/N): ");
            repeat = (keyboard.next().toUpperCase().charAt(0)) == 'Y';
            keyboard.nextLine();
        } while (repeat);
        keyboard.close();

        // Calculate and display the total fees collected from students for each examination type
        double totalPrimaryFees = 0.00;
        double totalSecondaryFees = 0.00;
        for (Student s : students) {
            if (s instanceof Primary) {
                totalPrimaryFees += ((Primary) s).calculatePrimaryFees();
            } else if (s instanceof Secondary) {
                totalSecondaryFees += ((Secondary) s).calculateSecondaryFees();
            }
        }
        System.out.println("\nTotal fees for primary students: RM" + totalPrimaryFees);
        System.out.println("Total fees for secondary students: RM" + totalSecondaryFees);

        // Determine total number of Primary students who have registered for both computer and extra language
        int primaryBothExtras = 0;
        for (Student s : students) {
            if (s instanceof Primary && s.getExtraLanguage() && s.getComputerCourse())
                primaryBothExtras++;
        }
        System.out.println("\nNumber of Primary students who have registered for both computer and extra language: " + primaryBothExtras);

        // List the student id and name for those who have registered FIVE (5) subjects for UPSR
        System.out.println("\nList of student ID and Name students who have registered 5 subjects for UPSR:");
        for (Student s : students) {
            if (s instanceof Primary)
             if (((Primary) s).getTotalSubject() == 5) {
                 System.out.println("Student ID: " + s.getStudentID() + " | Name: " + s.getStudentName());
             }
        }
    }
}
