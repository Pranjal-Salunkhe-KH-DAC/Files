//Question 4: Discount Calculation 

import java.util.Scanner;
public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter Purchased Amount: ");
	double purchase=sc.nextDouble();
        double discount = 0;
        if (purchase >= 1000) {
            discount = purchase * 0.20;
        } else if (purchase >= 500) {
            discount = purchase * 0.10;
        } else {
            discount = purchase * 0.05;
        }

        double finalPrice = purchase - discount;

        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Price: Rs. " + finalPrice);
    }
}