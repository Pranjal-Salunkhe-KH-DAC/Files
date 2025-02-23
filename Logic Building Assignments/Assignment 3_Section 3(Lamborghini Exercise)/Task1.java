//Task 1: Write a program to calculate the sum of the first 50 natural numbers. 

class Task1{
	public static void main(String args[]){
		int n=1;
		int sum=0;
		for(int i=1;i<=50;i++){
			sum=sum+i;
		}
		System.out.println("Sum is : "+sum);
	}
}