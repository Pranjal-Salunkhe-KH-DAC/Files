//Task 9: Write a program to find and print the largest digit in the number 4825. 

class Task9{

    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Largest digit: " + largestDigit);
    }
}