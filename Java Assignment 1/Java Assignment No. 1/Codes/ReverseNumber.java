//Q12. Reverse Number
import java.util.Scanner;
class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number: ");
	int num = sc.nextInt();
        int rev = 0;

        for (; num != 0; num /= 10) {
            rev = rev * 10 + (num % 10);
        }

        System.out.println("Reversed Number: " + rev);
    }
}
