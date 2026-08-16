import java.util.Scanner;
public class leap_year {
    static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = s.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        s.close();
    }

}
