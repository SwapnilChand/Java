import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double r = sc.nextDouble();
		double l = sc.nextDouble();
		double a = r * r * 3.141;
		double v = l * a;
		System.out.print("The area is " + a + "\nThe volume is " + v );
		sc.close();
	}

}
