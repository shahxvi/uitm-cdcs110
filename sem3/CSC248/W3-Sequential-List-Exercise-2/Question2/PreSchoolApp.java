import java.util.ArrayList;
import java.util.Scanner;

public class PreSchoolApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);

                // (a) Create an ArrayList object named PSList to store data of 5 children
                ArrayList PSList = new ArrayList();
                // (b) Input the data of FIVE (5) children into PSList
                for (int i = 0; i < 5; i++) {
                        System.out.print("\nEnter Pre-Schooler #" + (i+1) + " Name: ");
                        String name = keyboard.nextLine();

                        System.out.print("Enter Pre-Schooler #" + (i+1) + " Race: ");
                        String race = keyboard.nextLine();

                        System.out.print("Enter Pre-Schooler #" + (i+1) + " Age: ");
                        int age = keyboard.nextInt();
                        keyboard.nextLine();

                        PSList.add(new PreSchool(name, race, age));
                }

                // (c) Count and display the number of children for each race
                int malay = 0;
                int chinese = 0;
                int indian = 0;
                for (int i = 0; i < PSList.size(); i++) {
                        PreSchool children = (PreSchool) PSList.get(i);
                        if (children.getRace().equalsIgnoreCase("Malay")) malay++;
                        else if (children.getRace().equalsIgnoreCase("Chinese")) chinese++;
                        else if (children.getRace().equalsIgnoreCase("Indian")) indian++;

                }
                System.out.println("\nThe number of Malay students: " + malay);
                System.out.println("\nThe number of Chinese students: " + chinese);
                System.out.println("\nThe number of Indian students: " + indian);

                // (d) Given that every 4 years old preschooler is charged RM400 and 5 years
                //     children and 6 years old children are charged RM450, count and display
                //     the total collection for the preschool at the end of every month
                double totalCollection = 0;
                for (int i = 0; i < PSList.size(); i++) {
                        PreSchool children = (PreSchool) PSList.get(i);
                        if (children.getAge() == 4) totalCollection += 400.00;
                        else if (children.getAge() == 5 || children.getAge() == 6) totalCollection += 450.00;
                }
                System.out.printf("\nTotal collection for the preschool: RM %,.2f\n", totalCollection);

                keyboard.close();
        }
}
