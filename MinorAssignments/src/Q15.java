import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days taken by A to finsh the job alone.");
		int d1 = sc.nextInt();
		System.out.println("Enter the number of days taken by B to finsh the job alone.");
		int d2 = sc.nextInt();
		System.out.println("Thus the number of days in which they can complete the job working together are " + ((d1 * d2) / (d1 + d2)) + " days.");
	}

}
