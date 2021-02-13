import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:");
		double dX = sc.nextDouble();
		double dY = sc.nextDouble();
		double dDist = Math.sqrt(dX * dX + dY * dY);
		if(dDist <= 10) {
			System.out.println("Point (" + dX + ", " + dY + ") is in the circle" );
		}
		else {
			System.out.println("Point (" + dX + ", " + dY + ") is not in the circle" );
		}
		sc.close();
	}

}
