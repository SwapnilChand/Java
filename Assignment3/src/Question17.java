import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int iInt = sc.nextInt(); // 30
		boolean b1 = ((iInt % 5 == 0) && (iInt % 6 == 0));//true
		boolean b2 = ((iInt % 5 == 0) || (iInt % 6 == 0));//true
		String s3 = ((iInt % 5 == 0) ^ (iInt % 6 == 0)) ? "True" : "False";
		System.out.println("Is "+ iInt +" divisible by 5 and 6? " + b1);
		System.out.println("Is "+ iInt +" divisible by 5 or 6? " + b2);
		/*if(b1 == true) { // b1 = true
			 b3 = !b1;	//b3 = false
		}*/
		System.out.println("Is "+ iInt +" divisible by 5 or 6, but not both? " + s3);//false
		sc.close();
	}

}
