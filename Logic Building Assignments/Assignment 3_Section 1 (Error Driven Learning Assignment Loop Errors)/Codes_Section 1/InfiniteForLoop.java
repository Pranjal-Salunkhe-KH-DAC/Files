//Snippet 1:  
/*
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i--) { 
            System.out.println(i); 
        } 
    } 
} 
*/
/*

Q. Error to investigate: Why does this loop run infinitely? How should the loop control variable be adjusted?

Answer: Here we are giving the wrong condition and also the wrong decrement.
	Here we correct Decrement and make it increment i++.

*/
//Corrected Code: 
public class InfiniteForLoop { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 
