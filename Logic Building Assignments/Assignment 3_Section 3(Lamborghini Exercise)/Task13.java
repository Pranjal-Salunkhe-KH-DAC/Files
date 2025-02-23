/*
Task 13: Write a program to print the following pattern: 


1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2
*/
class Task13{

    public static void main(String[] args) {
        // Upper half of the pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        
        for (int i = 5; i >= 2; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}