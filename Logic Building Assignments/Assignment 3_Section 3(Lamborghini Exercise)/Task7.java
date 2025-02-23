//Task 7: Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 

class Task7{

    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; 
            sum += digit; 
            number /= 10; 
        }

        System.out.println(sum); 
    }
}