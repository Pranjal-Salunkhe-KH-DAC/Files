/*
Task 12. Write a program to draw the following pattern: 


***** 
***** 
***** 
***** 
*****
*/

class Task12{

    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}