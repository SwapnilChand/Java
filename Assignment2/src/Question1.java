/*
 * 
 * 
 * 
 */
import java.util.*;
public class Question1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two integers");
    int a = in.nextInt();
	int b = in.nextInt();
	boolean res = ((a % b == 0) || (b % a == 0));
	System.out.println("Result = " + res);
	
	}

}
