import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Menu Calculator!");
            System.out.println("Please select an option:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");
            System.out.print("Enter your choice (0-4): ");

            choice = s.nextInt();

            if (choice == 0)
                break;

            System.out.print("First number: ");
            double num1 = s.nextDouble();
            System.out.print("Second number: ");
            double num2 = s.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println("Result: " + (num1 / num2));
                    else
                        System.out.println("Error: Division by zero is not allowed.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        s.close();
    }
}