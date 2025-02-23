//Task 11: Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 

class Task11{

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result;

        result = ++a + b--;

        System.out.println("Result: " + result); // 16
        System.out.println("a: " + a); // 6
        System.out.println("b: " + b); // 9
    }
}
