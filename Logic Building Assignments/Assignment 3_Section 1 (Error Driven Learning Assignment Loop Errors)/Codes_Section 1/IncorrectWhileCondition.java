//Snippet 2: 
/* 
public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count = 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} */
/*

Q. Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the while` loop? 

Error: incompatible types: int cannot be converted to boolean

Answer: Here we are assigning binary value not any condition that is the problem
*/
//Corrected Code: 

public class IncorrectWhileCondition { 
    public static void main(String[] args) { 
        int count = 5; 
        while (count >= 0) { 
            System.out.println(count); 
            count--; 
        } 
    } 
} 