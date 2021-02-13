import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your gender (M or F):");
		char cGender = sc.next().charAt(0);
		System.out.println("First name:");
		String sFName = sc.nextLine();
		System.out.println("Last name:");
		String sLName = sc.nextLine();
		System.out.println("Age:");
		int iAge = sc.nextInt();
		//for female
		if(cGender == 'F') {
			if (iAge >=20) {
				System.out.println("Are you married," + sFName + "(y or n)?");
				char cMResp = sc.next().charAt(0);
				if(cMResp == 'y') {
					System.out.println("Then I shall call you Mrs. " + sFName + " " + sLName);
				}
				else {
					System.out.println("Then I shall call you Ms. " + sFName + " " + sLName);
				}
			}
			else if (iAge <20) {
				System.out.println("Then I shall call you " + sFName + " " + sLName);
			}
		}
		//for male
		else {
			if(iAge >= 20) {
				System.out.println("Then I shall call you Mr. " + sFName + " " + sLName);
			}
			else {
				System.out.println("Then I shall call you " + sFName + " " + sLName);
			}
		}
		sc.close();
		
	}

}
