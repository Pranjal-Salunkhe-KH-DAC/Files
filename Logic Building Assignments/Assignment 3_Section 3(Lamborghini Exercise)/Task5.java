//Task 5: Write a program to print the Fibonacci sequence up to the number 21. 

class Task5{
    public static void main(String args[]) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci sequence up to 21: " + num1 + " " + num2 + " ");

        int nextTerm = num1 + num2;
        while (nextTerm <= 21) {
            System.out.print(nextTerm + " ");
            num1 = num2;
            num2 = nextTerm;
            nextTerm = num1 + num2;
        }
    }
}
