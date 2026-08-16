import java.util.Scanner;
public class ModularNumberAnalyser {


    static int readNumber(Scanner i) {
        System.out.print("Enter a number: ");
        return i.nextInt();
    }
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    static boolean isPositive(int num) {
        return num > 0;
    }
    static int absoluteValue(int num) {
        if (num < 0)
            return -num;
        return num;
    }
    static int countDigits(int num) {
        if (num == 0)
            return 1;
        int c = 0;
        while (num > 0) {
            c++;
            num /= 10;
        }
        return c;
    }
    static int sumDigits(int num) {
        int s = 0;
        if (num == 0)
            return 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        return s;
    }
    static void printReport(int num, boolean even, boolean pos, int dCount, int dSum) {
        System.out.println("Number: " + num + "\nEven: " + even + "\nPositive: " + pos
                + "\nNumber of digits: " + dCount + "\nSum of digits: " + dSum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = readNumber(s);
        boolean e = isEven(n);
        boolean p = isPositive(n);
        int a = absoluteValue(n);
        int c = countDigits(a);
        int d = sumDigits(a);
        printReport(n, e, p, c, d);
        s.close();
    }
}

