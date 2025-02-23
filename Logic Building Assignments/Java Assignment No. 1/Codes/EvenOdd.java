//Q10. Check Number is Even or Odd
import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //ternary operator

        System.out.println("The number is " + ((num % 2 == 0) ? "Even" : "Odd"));
       
    }
}
