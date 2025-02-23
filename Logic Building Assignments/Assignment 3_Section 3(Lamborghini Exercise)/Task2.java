//Task 2: Write a program to compute the factorial of the number 10.

class Task2{
	public static void main(String args[]){
		int n=10;
		int fact=1;
		for(int i=1; i<n; i++){
			fact=fact*i;
		}
		System.out.println("Factorial of 10 is : "+fact);
	}
} 