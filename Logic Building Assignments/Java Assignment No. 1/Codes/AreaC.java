//Q9. Area of Circle
import java.util.Scanner;
class AreaC{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius: ");
		int r=sc.nextInt();
		final double pi=3.14;
		System.out.println("Area of Circle : "+(pi*r*r));

}
}