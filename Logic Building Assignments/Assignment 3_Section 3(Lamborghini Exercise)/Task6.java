//Task 6: Write a program to find and print the first 5 prime numbers. 

public class Task6{

    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        int num = 2;

        System.out.print("First 5 prime numbers: ");

        while (count < n) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                int i = 2;
                while (i < num) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}