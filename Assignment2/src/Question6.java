import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a value ");
		Scanner sc = new Scanner(System.in);
	    double x0  = sc.nextDouble();
	    double v0  = sc.nextDouble();
	    double t   = sc.nextDouble();
	    double g   = 9.78033;
	    double res = x0 + v0*t + ((g*t*t)/2);
	    System.out.println("Result = " + res);
	}

}
