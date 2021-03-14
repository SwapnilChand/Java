import java.util.*;
public class Q15 {

	public static double area(double s1, double s2, double s3) {
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}
	public static int area(int s1) {
		int area = s1 * s1;
		return area;
	}
	public static double area(double s1) {
		double area = Math.PI * s1 * s1;
		return area;
	}
	public static double area(double s1 ,double s2) {
		double area = s1 * s2;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the side(s) of your polygon.");
		double s1 = sc.nextDouble();//a side of a triangle, a side of a square, a radius of a circle and length/breadth of rectangle
		double s2 = sc.nextDouble();//a side of triangle, and length/breadth of rectangle
		double s3 = sc.nextDouble();//last side of the triangle
		double dTri = area(s1, s2, s3), dCircle = (double)area(s1), dRec = area (s1, s2);
		int iSqu = area((int)s1);
		System.out.println("The area of the triangle is " + dTri + " sq.units.\n"
				+ "The area of the square is " + iSqu + " sq.units.\n" 
				+ "The area of the circle is " + dCircle + " sq.units.\n" 
				+ "The area of the rectangle is " + dRec + " sq.units.\n" );
		sc.close();
	}

}
