//Snippet 5:  
/*
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i++) { 
            System.out.println(i); 
        } 
    } 
} */
/*

Q. Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the initialization and update statements in the `for` loop?

Answer: 
We given Greater than 10 condition and along with that we are incrementing the value of i, This creating mess.So we need to change condition and decrement it.

*/ 
//Corrected Code:
public class WrongInitializationForLoop { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    } 
}