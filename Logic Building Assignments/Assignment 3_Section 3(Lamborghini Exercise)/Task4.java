//Task 4: Write a program to reverse the digits of the number 1234.
//	  The output should be 4321.

class Task4{
	public static void main(String args[]){
		int num=1234;
		int rev=0;
		while (num != 0) {
            		int digit = num % 10; 
            		rev = rev * 10 + digit;  
            		num /= 10; 
       		 }
		System.out.println("Reversed Number is : "+ rev);
	}

}