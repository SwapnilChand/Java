import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 1st side of the triangle .");
		double a = sc.nextDouble();
		System.out.println("Enter the value of 2nd side of the triangle .");
		double b = sc.nextDouble();
		System.out.println("Enter the value of 3rd side of the triangle .");
		double c = sc.nextDouble();
		if((a < (b + c)) || (b < (a + c)) || (c < (a + b))){
			System.out.println("The triangle is possible.");
		}
		else {
			System.out.println("The triangle isn't possible.");
		}
	}

}
