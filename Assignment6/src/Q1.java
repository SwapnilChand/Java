import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N through keyboard.");
		int iN =sc.nextInt();
		for(int n = 0; n <= iN ; n++)
			System.out.println(n + "\t" + (int)Math.pow(2, n));
		sc.close();

	}

}
