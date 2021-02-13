import java.util.*;
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number");
		int iThreeDigit = sc.nextInt();
		int a = (int)(Math.pow((iThreeDigit = iThreeDigit % 10) , 3));//9
		int b = (int)(Math.pow((iThreeDigit = iThreeDigit % 10) , 3));//8
		int c = (int)(Math.pow((iThreeDigit = iThreeDigit % 10) , 3));//1
		System.out.println("the sum of each digit raised to the power 3 in\r\n"
				+ "a given 3 digit number is " + (a + b + c));
		sc.close();
		
		
		
	}

}
