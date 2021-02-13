import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iMark = sc.nextInt();
		if(iMark >= 40) {
			System.out.println("Congratulations!You have passed the exam.");
		}
		else {
			System.out.println("Sorry!You have failed the exam.");
		}
		sc.close();
	}

}
