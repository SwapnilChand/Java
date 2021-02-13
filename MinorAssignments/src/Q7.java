import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year.");
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		if (Year % 4 == 0) {
			System.out.println("Its a leap year.");
		}
		else if ((Year % 100 == 0) && (Year % 400 == 0)) {
			System.out.println("Its a leap year.");
		}
		else if ((Year % 100 != 0) && (Year % 4 == 0)) {
			System.out.println("Its a leap year.");
		}
		else {
			System.out.println("its not a leap year bro, sorry :(");
		}
	}

}
