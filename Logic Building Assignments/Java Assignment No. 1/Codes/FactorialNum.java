//Q15. Factorial of number

import java.util.Scanner;
class FactorialNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int n=sc.nextInt();
		int fact=1;

		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}

}