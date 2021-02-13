import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes: "); 
		int iMin = sc.nextInt();
		int iYears = iMin / 525600;
		int iMinLeft = iMin % 525600;
		int iDays = iMinLeft / 1440;
		System.out.println(iMin + " minutes is approximately " + iYears + " years and " + iDays +" days");
		sc.close();
	}

}
