import java.util.Scanner;
public class simpleintrest_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = scan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = scan.nextDouble();
        System.out.print("Enter the time period: ");
        double t = scan.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        System.out.println("Total Amount = " + (p + si));
    }
}
