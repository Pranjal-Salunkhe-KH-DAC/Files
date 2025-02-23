//Snippet 8:  
/*
public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} */
/*

Q.Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5? 

Answer: Because it is do while loop although we gave the wrong decrement and condition then also it executes only once. To correct it we need to change the decrement condition and condition also.

*/
//Corrected Code: 

public class OffByOneDoWhileLoop { 
    public static void main(String[] args) { 
        int num = 1; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <=5); 
    } 
}