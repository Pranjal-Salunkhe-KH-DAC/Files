//Snippet 26:  
/*public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} */
/*
Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block?

Answer: We can not assign the same case name...It creates an error of duplicate name.

*/
//Corrected Code: 
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 4: 
                System.out.println("Number is 5"); 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 