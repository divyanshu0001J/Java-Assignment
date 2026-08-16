import java.util.Scanner;
public class NumberReversal {
static int reverseNumber(int num){
    int rev = 0;
    while (num != 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num/= 10;
    }
    return rev;
}
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int n = reverseNumber(number);
        System.out.println("Reversed Number: " + n);

        s.close();
}
}
