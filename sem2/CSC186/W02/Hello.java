import java.util.Scanner;

public class Hello {
        public static void main (String[] args) {
                Scanner keyboard = new Scanner(System.in);
                double num1;
                double num2;

                System.out.println("Hello World");
                System.out.println(); // line seperator

                System.out.print("Enter your name: ");
                String name = keyboard.nextLine();
                name = name.trim();

                System.out.println(); // line seperator

                System.out.println("Hello " + name);

                System.out.print("Enter number #1: ");
                num1 = keyboard.nextDouble();

                System.out.print("Enter number #2: ");
                num2 = keyboard.nextDouble();

                double sum = summation(num1, num2);

                System.out.printf("Summation of %f + %f is %f\n", num1, num2, sum);
        }

        private static double summation(double num1, double num2) {
                return num1 + num2;
        }
}
