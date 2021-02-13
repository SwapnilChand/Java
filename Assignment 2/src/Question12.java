import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many eggs do you have ?");
		int iEggs = sc.nextInt();
		int iGross = iEggs / 144;
		iEggs = iEggs % 144;
		int iDozen = iEggs /12;
		iEggs = iEggs % 12;
		System.out.println("Your number of eggs is " + iGross + " gross, " + iDozen + " dozen," + " and " + iEggs + ".");
		sc.close();
		}

}
