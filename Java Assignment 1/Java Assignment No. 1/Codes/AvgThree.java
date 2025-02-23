//Q13. Average of Three Numbers
import java.util.Scanner;
class AvgThree{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		
		System.out.println("Number 1: ");
		int a=sc.nextInt();

		System.out.println("Number 2: ");
		int b=sc.nextInt();

		System.out.println("Number 3: ");
		int c=sc.nextInt();
		
		System.out.println("Average is : "+((a+b+c)/3));

	}

}