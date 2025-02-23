//Snippet 3:  
/*
public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num > 0); 
 
 
    } 
} 
*/
/*
Q. Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `do while` loop? 

Answer: 
This causing infinite loop because condition in while is wrong for corresponding increment

*/
//Corrected Code: 

public class DoWhileIncorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num <= 0); 
 
 
    } 
} 