import java.util.*;
public class Q12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanna check");
		int dNum = sc.nextInt();	 //31
		int dQ = dNum / 2;	//31 / 2 = 15
		System.out.println(dNum);
		int dRem = (dNum - (dQ * 2));	// dRem = 31 - (15 * 2) = 31-30 = 1
		if(dRem == 1.0) {
			System.out.println("The number is odd.");
		}
		else {
			System.out.println("The number is even.");
			sc.close();
		}
	}

}///how to check for floating point decimals
