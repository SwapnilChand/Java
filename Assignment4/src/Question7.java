import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// Enter an integer N as a command-line argument 
		// to print N uniform random values between 0 and 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = sc.nextInt();
		double dRand;
		double dSum = 0;
		for (int n = 1; n <= N ; n ++)
		{
			dRand = Math.random();
			System.out.println(dRand);
			dSum = dSum + dRand;
		}
		System.out.println("\nThe average is = ("+dSum + " / " + "N) = " + dSum/N);
	sc.close();
	}

}
