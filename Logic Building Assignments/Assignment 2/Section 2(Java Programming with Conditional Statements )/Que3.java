//Question 3: Calculator  

import java.util.Scanner;
class Que3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int a=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int b=sc.nextInt();

		System.out.println("Enter Operation(1. Add 2. Subtract 3. Multiply 4. Divide 5. Modulous)");
		int Op=sc.nextInt();
		switch(Op){
			case 1:
				System.out.println("Addtion is : "+(a+b));
				break;
			case 2:
				System.out.println("Subtraction is : "+(a-b));
				break;
			case 3:
				System.out.println("Multiplication is : "+(a*b));
				break;
			case 4:
				System.out.println("Division is : "+(a/b));
				break;
			case 5:
				System.out.println("Modulous is : "+(a%b));
				break;
		
			default:
				System.out.println("Error 404");
				break;

		}

	}


}