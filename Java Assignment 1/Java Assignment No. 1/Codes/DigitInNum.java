//Q20. Calculate the number of digits in the number
import java.util.Scanner;
class DigitInNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		int count=0;	
		if(n==0){
			count=1;
		}
		
		for(int i=n;i!=0;i/=10){
			count++;
			if(i<0){
				i=-i;
			}
		}
		System.out.println("Number are : "+count);
		
	}

}