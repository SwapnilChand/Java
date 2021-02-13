import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your nationality.");
		String sNat = sc.nextLine();
		if(sNat == "Indian") {
			System.out.println("Housing loans can be given.");
		}
		else {
			System.out.println("Housing loans cannot be given.");
		}

	}

}
