import java.util.*;
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the four angles of a quadilateral");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double dSum = A + B + C + D;
		if(dSum <= 360) {
			System.out.println("The quadilateral is possible");
			
		}
		else {
			System.out.println("The quadilateral is not possible");

		}
	}
}
