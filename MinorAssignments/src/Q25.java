import java.util.*;
public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed for the month");
		int iUnits = sc.nextInt();
		int iUnitsLeft ,iPrice;
		if(iUnits > 100) {
			iUnitsLeft = iUnits - 100;
			iPrice = (100 * 5) + (iUnitsLeft * 6);
			System.out.println("The amount to be paid for the month is Rs." + iPrice);
			}
		else {
			iPrice = iUnits * 5;
			System.out.println("The amount to be paid for the month is Rs." + iPrice);
		}
		sc.close();
	}

}
