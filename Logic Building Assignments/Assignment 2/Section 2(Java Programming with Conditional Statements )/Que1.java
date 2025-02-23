//Question 1: Grade Classification 
import java.util.Scanner;
class Que1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks : ");
		int m=sc.nextInt();
		if(m>=90){
			System.out.println("Grade is : A");
		}
		else if(m>=80 && m<=89){
			System.out.println("Grade is : B");

		}
		else if(m>=70 && m<=79){
			System.out.println("Grade is : C");

		}
		else if(m>=60 && m<=69){
			System.out.println("Grade is : D");

		}
		else if(m<60){
			System.out.println("Grade is : E");

		}
		else{
			System.out.println("Grade is : F");

		}
	}
}
