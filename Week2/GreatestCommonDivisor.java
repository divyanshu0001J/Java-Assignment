import java.util.Scanner;
public class GreatestCommonDivisor {
    static int gcd(int a, int b) {
       while (b != 0) {
           int remainder = a % b;
           a = b;
           b = remainder;
       }
       return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();

        int result = gcd(a, b);
        System.out.println("Greatest Common Divisor: " + result);

        s.close();
    }
}