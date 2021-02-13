import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms");
		int M = sc.nextInt();
		System.out.println("Intial Temperature :");
		double iTemp = sc.nextDouble();
		System.out.println("Final Temperature :");
		double fTemp = sc.nextDouble();
		double Q = M * (fTemp - iTemp)*4184;
		System.out.println(" The energy needed to heat water from an initial temperature" + iTemp + " to the final temperature" + fTemp + " is " + Q);
		}

}
