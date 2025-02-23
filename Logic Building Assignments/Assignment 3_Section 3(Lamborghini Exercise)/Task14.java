/*
Task 14: 14. Write a program to print the following pattern: 
 
 * 
 ** 
 *** 
 ***** 
 ******* 
 *********
*/

class Task14{

    public static void main(String[] args) {
        int rows = 6; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}