import java.util.Scanner;
public class temp_conv {
public static void main(String[]args)throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println  ("Choose :\n 1)Celsius \n 2)Fahrenheit ");
        int n = scan.nextInt();
        System.out.print("Enter the temperature :");
        int a = scan.nextInt();
        if(n==1){
            System.out.println("Fahrenheit= " + ((a*9/5)+32));
        }
        else if(n==2){
            System.out.println("Celsius= " + ((a-32)*5/9));
        }
        
        else{
            System.out.println("Enter a valid number");
        }

}
}



