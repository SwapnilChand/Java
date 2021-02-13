import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a value ");
		Scanner sc = new Scanner(System.in);
	    double t = sc.nextDouble();
	    double b = Math.toRadians(t);
	    double c = Math.sin(2 * b) + Math.sin(3 * b);
	    System.out.println("Result = " + (c));
	}

}
