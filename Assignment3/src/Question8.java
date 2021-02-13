import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ages of Rahul , Ayush and Ajay.");
		int iRa = sc.nextInt();
		int iAy = sc.nextInt();
		int iAj = sc.nextInt();
		if(iRa < iAy) {
			if(iAy < iAj)
				System.out.println("Ajay is the eldest.");
			else
				System.out.println("Ayush is the eldest.");

		}
		else {
			if(iRa < iAj)
				System.out.println("Ajay is the eldest.");
			else
				System.out.println("Rahul is the eldest.");

		}
		sc.close();

	}
	
}
