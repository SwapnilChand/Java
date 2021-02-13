import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three points for a triangle: ");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float x3 = sc.nextFloat();
		float y3 = sc.nextFloat();
		float side1 = (float)Math.pow(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) , 0.5);
		float side2 = (float)Math.pow(((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3)) , 0.5);
		float side3 = (float)Math.pow(((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1)) , 0.5);
		float s = (side1 + side2 + side3) / 2;
		float area = (float)Math.pow((s * (s - side1) * (s - side2) * (s - side3)) , 0.5);
		System.out.println("The area of the triangle is " + area);
		sc.close();
	}

}
