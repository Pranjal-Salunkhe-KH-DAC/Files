//Q7. Multiplication Table of 8
import java.util.Scanner;

class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        
        System.out.println("\nMultiplication Table of " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        sc.close(); 
    }
}
