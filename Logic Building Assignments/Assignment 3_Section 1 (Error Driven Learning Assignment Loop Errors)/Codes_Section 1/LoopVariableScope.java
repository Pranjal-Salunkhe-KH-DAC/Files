//Snippet 12:  
/*
public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        } 
        System.out.println(x); // Error: 'x' is not accessible here 
    } 
} */
/* 
Q. Error to investigate: Why does the variable 'x' cause a compilation error? How does scope

Error: cannot find symbol

Answer: This error is because that SOP statement is out of the scope of for loop.
*/

//Corrected Code: 

public class LoopVariableScope { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            int x = i * 2; 
        
        System.out.println(x);
	}
    } 
}