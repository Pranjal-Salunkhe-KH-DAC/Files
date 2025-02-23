//Snippet 6:  
/*
public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) 
            System.out.println(i); 
            System.out.println("Done"); 
    } 
} 
*/
/*

Q.Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to include all statements within the loop?

Answer: Done is printing only once because the loop's scope ends before it. We have not given curly braces that's why the loop is not proceeding with the Done printing statement.

*/
//Corrected Code
 public class MisplacedForLoopBody { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++){
            System.out.println(i); 
            System.out.println("Done"); 
	}
    } 
} 
