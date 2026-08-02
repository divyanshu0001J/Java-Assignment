import java.util.Scanner;
public class digit_extraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        System.out.print("Hundreds:");
        int hundreds = (number / 100) % 10;
        System.out.println(hundreds);
        System.out.print("Tens:");
        int tens = (number / 10) % 10;
        System.out.println(tens);
        System.out.print(" Ones:");
        int ones = number % 10;
        System.out.println(ones);
    }
}
