import java.util.Scanner;
public class BitMaskUtility {
    static boolean isBitSet(int n, int p) {
        int m = 1 << p;
        if ((n & m) != 0)
            return true;
        return false;
    }
    static int setBit(int n, int p) {
        int m = 1 << p;
        return n | m;
    }
    static int clearBit(int n, int p) {
        int m = 1 << p;
        return n & ~m;
    }
    static int toggleBit(int n, int p) {
        int m = 1 << p;
        return n ^ m;
    }
    static String toBinary32(int n) {
        String b = Integer.toBinaryString(n);
        while (b.length() < 32) {
            b = "0" + b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Check Bit\n2. Set Bit\n3. Clear Bit\n4. Toggle Bit\n5. Exit");
            System.out.print("Enter choice: ");
            int c = sc.nextInt();
            if (c == 5)
                break;
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            System.out.print("Enter bit position: ");
            int p = sc.nextInt();
            if (p < 0 || p > 31) {
                System.out.println("INVALID POSITION");
                continue;
            }
            System.out.println("Before:\nDecimal: " + n + "\nBinary: " + toBinary32(n));
            switch (c) {
                case 1:
                    if (isBitSet(n, p))
                        System.out.println("Bit is SET");
                    else
                        System.out.println("Bit is NOT SET");
                    break;
                case 2:
                    n = setBit(n, p);
                    System.out.println("After:\nDecimal: " + n + "\nBinary: " + toBinary32(n));
                    break;
                case 3:
                    n = clearBit(n, p);
                    System.out.println("After:\nDecimal: " + n + "\nBinary: " + toBinary32(n));
                    break;
                case 4:
                    n = toggleBit(n, p);
                    System.out.println("After:\nDecimal: " + n + "\nBinary: " + toBinary32(n));
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
        sc.close();
    }
}