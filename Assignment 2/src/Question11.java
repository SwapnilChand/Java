import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		float fIA = sc.nextFloat();
		System.out.println("Enter annual interest rate in percentage: ");
		float fIR = sc.nextFloat();
		fIR = fIR / 1200;
		System.out.println("Enter number of years: ");
		float fNY = sc.nextFloat();
		float fIV = fIA * ((float)(Math.pow(1 + fIR ,fNY * 12)));
		System.out.println("Accumulated value is $" + (fIV));
		sc.close();
	}

}
