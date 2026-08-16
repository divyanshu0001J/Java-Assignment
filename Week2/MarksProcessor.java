import java.util.Scanner;
public class MarksProcessor {


public class Marks {
    static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    static double average(int sum, int count) {
        if (count == 0)
            return 0;
        return (double) sum / count;
    }

    static void printResults(int count, int sum, double avg, int hig, int passes, int fail) {
        System.out.println("Number of valid marks: " + count + "\nSum of marks: " + sum
                + "\nAverage mark: " + avg + "\nHighest mark: " + hig
                + "\nNumber of passes: " + passes + "\nNumber of failures: " + fail);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mark, count = 0, sum = 0, hig = 0, pass = 0, fail = 0;

        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            mark = s.nextInt();

            if (mark == -1)
                break;

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark.");
                continue;
            }

            count++;
            sum += mark;

            if (count == 1 || mark > hig)
                hig = mark;

            if (mark >= 50)
                pass++;
            else
                fail++;
        }

        double avg = average(sum, count);
        printResults(count, sum, avg, hig, pass, fail);

        s.close();
    }
}
}
