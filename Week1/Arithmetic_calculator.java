import java.util.Scanner;
public class Arithmetic_calculator {
    public static void main(String[]args)throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println  ("Choose :\n 1)Addition \n 2)Subtraction \n 3)Multiplication \n 4)Division");
        int n = scan.nextInt();
        System.out.print("Enter the first number :");
        int a = scan.nextInt();
        System.out.print("Enter the second number :");
        int b = scan.nextInt();
        if(n==1){
            System.out.println("Sum= " + (a+b));
        }
        else if(n==2){
            System.out.println("Diffrence= " + (a-b));
        }
        else if(n==3){
            System.out.println("Product= " + (a*b));
        }
        else if(n==4){
            System.out.println("Quotient= " + (a/b));
        }
        else{
            System.out.println("Enter a valid number ");
        }

}
}

