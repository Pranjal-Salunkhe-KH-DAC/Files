//Q8. Swap Two Numbers
import java.util.Scanner;
class Swap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Enter Two Numbers To Swap----------");
		System.out.println("First Number: ");
		int a=sc.nextInt();
		System.out.println("Second Number: ");
		int b=sc.nextInt();
		
		/*int temp;
		temp=a;
		a=b;
		b=temp;*/
		
		
		//Without Temp
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("--------Numbers After Swapping---------");
		System.out.println("First Number: "+a);
		System.out.println("Second Number: "+b);


	}
}