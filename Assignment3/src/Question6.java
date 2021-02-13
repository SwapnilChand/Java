import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e and f.");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		if((a * d - b * c) == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			System.out.println( "x = " + (e * d - b * f) / (a * d - b * c) + ", y = " + (a * f - e * c) / (a * d - b * c));
		
		}
		sc.close();
		
	}

}
