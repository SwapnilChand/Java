import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x-y coordinates");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if(x == 0 && y != 0)
			System.out.println("The point lies on the y - axis.");
		else if(y == 0 && x != 0)
			System.out.println("The point lies on the x - axis.");
		else if(y > 0 && x > 0)
			System.out.println("The point lies in the first quadrant.");
		else if(y > 0 && x < 0)
			System.out.println("The point lies in the second quadrant.");
		else if(y < 0 && x < 0)
			System.out.println("The point lies in the third quadrant.");
		else if(y < 0 && x > 0)
			System.out.println("The point lies in the fourth quadrant.");
		else 
			System.out.println("The point lies on the origin.");
		sc.close();

	}

}
