import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
	    long  a = sc.nextInt();
		System.out.println("Enter the value of b ");
	    long  b = sc.nextInt();
	    a = a ^ b;//a = 0011 ^ 0010 = 0001
	    b = a ^ b;//b = 0001 ^ 0010 = 0011
	    a = a ^ b;//a = 0001 ^ 0011 = 0010
	    System.out.println("After swapping :- ");
	    System.out.println("The value of a - " + a);
	    System.out.println("The value of b - " + b);	
		}

}
