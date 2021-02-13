import java.util.Scanner;
public class ProblemStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int iAge = sc.nextInt();
		if(iAge < 18)
			
			System.out.println("The person is minor.");
		
		else if(iAge >= 18 && iAge < 60) 
		
			System.out.println("The person is adult.");

		else if (iAge >= 60) 
			System.out.println("The person is senior citizen.");
		
		else
			
			System.exit(0);
		
		sc.close();
		
	}
	
}