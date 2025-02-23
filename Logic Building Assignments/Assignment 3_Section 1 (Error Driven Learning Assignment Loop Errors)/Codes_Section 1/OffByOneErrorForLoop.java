//Snippet 4:  
/*
public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 
*/
/*

Q. Error to investigate: What is the issue with the loop boundaries? How should the loop be adjusted to meet the expected output? 

Answer: Cause in condition of for loop we gave condition i<=10.
	So it will prints 10 also.
*/
//Corrected Code: 
public class OffByOneErrorForLoop { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { 
            System.out.println(i); 
        } 
        
    } 
} 
