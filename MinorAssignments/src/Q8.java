import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Distance
		System.out.println("Enter the distance to drive");
		double dDist = sc.nextDouble();
		System.out.println("Enter the fuel efficiency of the car in miles per gallon");
		double dFeff = sc.nextDouble();
		System.out.println("Enter the price per gallon");
		double dPrice = sc.nextDouble();
		double dCost = (dDist / dFeff) * dPrice ;
		System.out.println("Therefore, the cost of the trip is " + dCost);

	}

}
