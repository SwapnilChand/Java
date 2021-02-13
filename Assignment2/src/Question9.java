import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input three double values ");
		java.util.Scanner sc = new Scanner(System.in);
		double x   = sc.nextDouble();
	    double y   = sc.nextDouble();
	    double z   = sc.nextDouble();
	    boolean res = ((x < y) && (y < z)) || ((x > y) && (y > z));
		System.out.println("Result = " + res);

	}

}
