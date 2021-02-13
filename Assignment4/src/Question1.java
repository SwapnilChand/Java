import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a message");
	String sMessage = sc.nextLine();
	System.out.println(sMessage);
	System.out.println();
	int i = 1;
	while(i <= 10) {
		if (i == 1)
			System.out.println(i + "st " + sMessage);
		else if(i == 2)
			System.out.println(i + "nd " + sMessage);
		else if(i == 3)
			System.out.println(i + "rd " + sMessage);
		else 
			System.out.println(i + "th " + sMessage);
		i++;
	}
	sc.close();

	}

}
