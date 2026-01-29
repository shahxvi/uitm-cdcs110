import java.util.Scanner;

public class PresenterApp {
    public static void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of presenter: ");
        Presenter[] presenter = new Presenter[keyboard.nextInt()];
        keyboard.nextLine();

        for (int i = 0; i < presenter.length; i++) {
            System.out.println("\n1. Paper Presenter");
            System.out.println("2. SDC Presenter");
            System.out.print("\nEnter presenter type (1/2): ");
            if (keyboard.nextInt() == 1) {
                presenter[i] = new PaperPresenter();
            } else {
                presenter[i] = new SdcPresenter();
            }
            keyboard.nextLine();

            System.out.print("\nEnter presenter name: ");
            presenter[i].setPresenterName(keyboard.nextLine());

            System.out.print("\nEnter presenter ID: ");
            presenter[i].setPresenterID(keyboard.nextInt());
            keyboard.nextLine();

            System.out.print("\nEnter presenter affiliation: ");
            presenter[i].setPresenterAffliation(keyboard.nextLine());


            System.out.println("\n| --------------- | ------------------- |");
            System.out.println("| Presenter       | Enrollment Fee (RM) |");
            System.out.println("| --------------- | ------------------- |");
            System.out.println("| Paper Presenter |                     |");
            System.out.println("| Sector A        | 180.00              |");
            System.out.println("| Sector I        | 200.00              |");
            System.out.println("| --------------- | ------------------- |");
            System.out.println("| SDC Presenter   |                     |");
            System.out.println("| Level 1         | 100.00              |");
            System.out.println("| Level 2         | 150.00              |");
            System.out.println("| --------------- | ------------------- |");

            if (presenter[i] instanceof PaperPresenter) {
                System.out.print("\nEnter Sector (A/I): ");
                ((PaperPresenter) presenter[i]).setSector(Character.toUpperCase(keyboard.nextLine().charAt(0)));
            } else {
                System.out.print("\nEnter Level (1/2): ");
                ((SdcPresenter) presenter[i]).setLevel(keyboard.nextInt());
                keyboard.nextLine();
            }
        }

        // Calculate the total charge received from the industry sector
        double totalChargeIndustry = 0.00;
        for (Presenter p : presenter) {
            if (p instanceof PaperPresenter && ((PaperPresenter) p).getSector() == 'I')
                totalChargeIndustry += p.enrollFee();
        }
        System.out.println("\nTotal charge received from the industry sector: RM" + totalChargeIndustry);

        // Count and display the number of SDC presenters from the undergraduate category
        int numSDC1 = 0;
        for (Presenter p : presenter) {
            if (p instanceof SdcPresenter && ((SdcPresenter) p).getLevel() == 1)
                numSDC1++;
        }
        System.out.println("\nNumber of SDC presenters from the undergraduate category: " + numSDC1);
    }
}
