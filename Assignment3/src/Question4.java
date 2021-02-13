import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a SINGLE CHARACTER.");
		Scanner sc = new Scanner(System.in);
		double iChar = sc.next().charAt(0);//we can also use char data type here since by default the compiler converts a char into its corresponding ASCII.
		if (iChar >= 65 && iChar <= 90) //how can we use double/int float also?
			System.out.println("Its a uppercase alphabet.");//becoz of implicit
		else if(iChar >= 97 && iChar <= 122) 
			System.out.println("Its a lowercase alphabet.");
		else if(iChar >= 48 && iChar <= 57) 
			System.out.println("Its a digit.");
		else if((iChar >= 0 && iChar <= 47) || (iChar >= 58 && iChar <= 64) || (iChar >= 91 && iChar <= 96) || (iChar >= 123 && iChar <= 127))
			System.out.println("Its a special symbol.");
		else 
			System.out.println("Its an invalid character.");	
		sc.close();
		System.exit(0);
		}
	
}