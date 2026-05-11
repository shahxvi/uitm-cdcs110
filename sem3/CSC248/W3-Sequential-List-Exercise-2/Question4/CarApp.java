import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                ArrayList carRecords = new ArrayList();

                for (int i = 0; i < 5; i++) {
                    System.out.print("\nEnter car registration number: ");
                    String regNumber = keyboard.nextLine();

                    System.out.print("Enter car manufacturer: ");
                    String manufacturer = keyboard.nextLine();

                    System.out.print("Enter car price: ");
                    double price = keyboard.nextDouble();
                    keyboard.nextLine();

                    System.out.print("Enter year of purchase: ");
                    int yearPurchase = keyboard.nextInt();
                    keyboard.nextLine();

                    carRecords.add(new Car(regNumber, manufacturer, price, yearPurchase));
                }

                // (a) Find and display the information of a car
                //     based on the registrationNo given by the
                //     user. If the information does not exist,
                //     display the appropriate message
                System.out.print("\nEnter registration number to search: ");
                String registrationQuery = keyboard.nextLine();
                boolean found = false;
                for (int i = 0; i < carRecords.size(); i++) {
                        Car car = (Car) carRecords.get(i);
                        if (registrationQuery.equalsIgnoreCase(car.getRegNumber())) {
                                found = true;
                                System.out.println("" + carRecords.get(i));
                        }
                }
                if (!found) {
                        System.out.println("Registration number not found");
                }

                // (b) Count and display the number of cars registered in Perlis
                int perlisCount = 0;
                for (int i = 0; i < carRecords.size(); i++) {
                        Car car = (Car) carRecords.get(i);
                        if (car.getRegNumber().startsWith("R") || car.getRegNumber().startsWith("r")) {
                                perlisCount++;
                        }
                }
                System.out.println("The number of cars registered in Perlis: " + perlisCount);

                // (c) Display the name of the owner with the most expensive car
                for (int i = 0; i < carRecords.size(); i++) {
                        Car car = (Car) carRecords.get(i);
                }

                // (d) Find and remove all the "Honda" cars
                for (int i = 0; i < carRecords.size(); i++) {
                        Car car = (Car) carRecords.get(i);
                        if (car.getManufacturer().equalsIgnoreCase("Honda")) {
                                carRecords.remove(i);
                                i--;
                        }
                }

                // (e) Display the current size of carRecords
                System.out.println("Size of carRecords: " + carRecords.size());

                keyboard.close();
        }
}
