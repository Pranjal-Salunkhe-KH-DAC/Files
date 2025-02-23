//Snippet 10:  
/*
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num = 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
*/
/*

Q.Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?

Error: incompatible types: int cannot be converted to boolean

Answer: We are assigning non zero value instead of condition, Because of that it is not working.

*/
//Corrected Code: 
public class IncorrectWhileLoopControl { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num >= 0) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 
