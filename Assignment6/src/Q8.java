import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		int iSides = sc.nextInt();
		System.out.println("Enter the length of one side:");
		double dSideLength = sc.nextInt();
		double dArea = area(iSides, dSideLength);
		System.out.println("The area of a regular polygon is " + dArea);
		sc.close();
	}
	public static double area(int n, double side) {
		double area = ((n * side * side)/(4 * Math.tan(Math.PI / n)));
		return area;
	}

}
