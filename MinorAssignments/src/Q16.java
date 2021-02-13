import java.util.*;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder.");
		double r = sc.nextDouble();
		System.out.println("Enter the height of the cylinder.");
		double h = sc.nextDouble();
		double Vol = pi * r * r * h;
		double CSA = 2 * pi * r * h;
		double TSA = 2 * pi * r *(h + r);
		System.out.print("Volume of Cylinder = " + Vol + " cubic units.\nCurved Surface Area of Cylinder = " + CSA + " square units.\nTotal Surface Area of Cylinder = " + TSA + " square units.");
		}

}
