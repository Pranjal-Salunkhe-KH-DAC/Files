//Q16. Prime number check
import java.util.Scanner;
class PrimeNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		if(n<=1){
			System.out.println(n+"is not Prime");
		}
		for(int i=2; i*i<=n; i++){
			if(n%i==0){
				System.out.println(n +" is not Prime");

			}
		}
		

	}
}