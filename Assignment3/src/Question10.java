import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int iT = sc.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int iF = sc.nextInt();
		String s = null, s1 = null;
		switch(iT)
		{
		case 0:
			s = "Sunday";
			break;
		case 1:
			s = "Monday";
			break;
		case 2:
			s = "Tuesday";
			break;
		case 3:
			s = "Wednesday";
			break;
		case 4:
			s = "Thursday";
			break;
		case 5:
			s = "Friday";
			break;
		case 6:
			s = "Saturday";
			break;
		}
		iF = (iT + iF) % 7;
		switch(iF)
		{
		case 0:
			s1 = "Sunday";
			break;
		case 1:
			s1 = "Monday";
			break;
		case 2:
			s1 = "Tuesday";
			break;
		case 3:
			s1 = "Wednesday";
			break;
		case 4:
			s1 = "Thursday";
			break;
		case 5:
			s1 = "Friday";
			break;
		case 6:
			s1 = "Saturday";
			break;
		}
		System.out.println("Today is " + s + " and the future day is " + s1 );
		sc.close();
	}

}
