//Task 3: Write a program to print all multiples of 7 between 1 and 100. 

class Task3{
	public static void main(String args[]){
		int n=7;
		System.out.println("Multiple of 7 : ");
		for(int i=1; (n*i)<=100; i++){
			
			System.out.print((n*i)+ " ");
		}
	
	}
}