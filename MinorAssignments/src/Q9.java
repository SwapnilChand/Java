import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the annual balance.");
		double dBal = sc.nextDouble();
		System.out.println("Enter the annual percentage interest rate.");
		double dAnn = sc.nextDouble();
		double dInt = dBal * (dAnn / 1200);
		System.out.println("Therefore ,the interest for the next month is " + dInt);
		}

}
