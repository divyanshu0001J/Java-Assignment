import java.util.Scanner;
public class grading_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Distinction");
        } else if (score >= 70 && score < 80) {
            System.out.println("Merit");
        } else if (score >= 50 && score < 70) {
            System.out.println("Pass");
        } else if (score >= 0 && score < 50) {
            System.out.println("Fail");
        }
           
        scanner.close();
    }

}
