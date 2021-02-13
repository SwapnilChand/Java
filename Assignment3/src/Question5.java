import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a, b and c");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (a != 0) {
			
			double D = (b * b) - (4 * a * c);
			if(D > 0) {
			double r1 = (-b + Math.pow(D , 0.5)) / (2 * a);
			double r2 = (-b - Math.pow(D , 0.5)) / (2 * a);
			System.out.println("The equation has two real roots : " + r1 + " " + r2 );
			}
			
			else if (D == 0)
				System.out.println((- b / 2 * a) + "the discriminant is 0, and the equation has one root.");
			else 
				System.out.println();	
		}
		
		else 
			System.out.println("Its not a quadratic equation.");	
		sc.close();
	}

}
