import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the train (in km)");
		double l1 = sc.nextDouble();
		System.out.println("Enter the speed of the train (in km/h)");
		double p = sc.nextDouble();
		System.out.println("Enter the length of the bridge (in km)");
		double l2 = sc.nextDouble();
		System.out.println("The time taken is " + ((l1 + l2)/p) + "hr");
	
	}

}
