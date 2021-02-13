import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Input Length of Rectangle");
	 double l = sc.nextInt();
	 System.out.println("Input Breadth of the Rectangle");
	 double b = sc.nextInt();
	 System.out.println("Input Radius of the Circle");
	 double r = sc.nextInt();
	 System.out.println("Perimeter of the Rectangle = " + 2*(l + b));
	 System.out.println("Area of the Rectangle = " + (l * b));
	 System.out.println("Area of the Circle = " + (3.14 * (r * r)));
	 System.out.println("Circumference of the Circle = " + (2 * 3.14 * r));
	}

}
