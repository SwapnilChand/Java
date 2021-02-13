import java.util.*;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		double dNum = sc.nextDouble();
		//the last digit of the square of any number is either of the following :- 0/1/4/5/6/9
		if (((dNum % 10 == 0) || (dNum % 10 == 1) || (dNum % 10 == 4) || (dNum % 10 == 5) || (dNum % 10 == 6) || (dNum % 10 == 9)) )
		{
			System.out.println("The number is a perfect square.");
		}
		else {
			System.out.println("The number is not a perfect square. ");
		}
	}
	
}
