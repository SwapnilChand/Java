import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month and year in number");
		int iMonth = sc.nextInt();
		int iYear = sc.nextInt();
		String sMonth = null;
		int iDays = 0;
		switch(iMonth) {
		case 1:
			sMonth = "January";
			iDays = 31;
			break;
		case 2:
			sMonth = "February";
			if(iYear % 4 == 0)
				iDays = 29;
			else
				iDays = 28;
			break;
		case 3:
			sMonth = "March";
			iDays = 31;
			break;
		case 4:
			sMonth = "April";
			iDays = 30;
			break;
		case 5:
			sMonth = "May";
			iDays = 31;
			break;
		case 6:
			sMonth = "June";
			iDays = 30;
			break;
		case 7:
			sMonth = "July";
			iDays = 31;
			break;
		case 8:
			sMonth = "August";
			iDays = 31;
			break;
		case 9:
			sMonth = "September";
			iDays = 30;
			break;
		case 10:
			sMonth = "October";
			iDays = 31;
			break;
		case 11:
			sMonth = "November";
			iDays = 30;
			break;
		case 12:
			sMonth = "December";
			iDays = 31;
			break;	
		}
		System.out.println(sMonth + " " + iYear + " had " + iDays + " days.");
		sc.close();
	}

}
