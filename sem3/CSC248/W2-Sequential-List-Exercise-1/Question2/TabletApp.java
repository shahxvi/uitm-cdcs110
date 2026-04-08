import java.util.ArrayList;
import java.util.Scanner;

public class TabletApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);

                // a) Insert data of 20 Tablets into a sequential list named TabletList
                ArrayList TabletList = new ArrayList();

                for (int i = 0; i < 2; i++) {
                        System.out.print("\nEnter Tablet Serial Number: ");
                        String serialNum = keyboard.nextLine();

                        System.out.print("Enter Tablet Manufacturer: ");
                        String manufacturer = keyboard.nextLine();

                        System.out.print("Enter Tablet Operating System: ");
                        String OS = keyboard.nextLine();

                        System.out.print("Enter Tablet Price: RM");
                        double price = keyboard.nextDouble();
                        keyboard.nextLine();

                        TabletList.add(new Tablet(serialNum, manufacturer, OS, price));
                }
                // b) Copy the data of Tablets which have the price of more than RM2,000 to another sequential list named more2K
                ArrayList more2K = new ArrayList();

                for (int i = 0; i < TabletList.size(); i++) {
                        Tablet tablet = (Tablet) TabletList.get(i);
                        double tabletPrice = (double) tablet.getPrice();
                        if (tabletPrice > 2000) {
                                more2K.add(TabletList.get(i));
                        }
                }

                // c) Determine and display the price of the most expensive Android tablet
                double mostExpensiveAndroid = -99999;
                for (int i = 0; i < TabletList.size(); i++) {
                        Tablet tablet = (Tablet) TabletList.get(i);

                        if (!tablet.getOS().equalsIgnoreCase("Android")) {
                                continue;
                        }
                        if (tablet.getPrice() < mostExpensiveAndroid) {
                                continue;
                        }
                        mostExpensiveAndroid = tablet.getPrice();
                }
                System.out.println("\nPrice of the most expensive Android tablet: RM" + mostExpensiveAndroid);

                // d) Count and display the number of Samsung tablets installed with Android operating system
                int androidSamsung = 0;
                for (int i = 0; i < TabletList.size(); i++) {
                        Tablet tablet = (Tablet) TabletList.get(i);

                        if (!tablet.getManf().equalsIgnoreCase("Samsung")) {
                                continue;
                        }
                        if (!tablet.getOS().equalsIgnoreCase("Android")) {
                                continue;
                        }
                        androidSamsung++;
                }
                System.out.println("\nThe number of Samsung tablets installed with Android: " + androidSamsung);
        }
}
