import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark secured by the student");
		int iMarks = sc.nextInt();
		char cGrade = 'a';
		switch(iMarks / 10) {
		
		case 10:
			
		case 9:
			cGrade = 'O';
			break;
		case 8:
			cGrade = 'A';
			break;
		case 7:
			cGrade = 'B';
			break;
		case 6:
			cGrade = 'C';
			break;
		case 5:
			cGrade = 'D';
			break;
		case 4:
			cGrade = 'E';
			break;
		default:
			cGrade = 'F';
}
		System.out.println(cGrade);
		sc.close();
		
	}

}
