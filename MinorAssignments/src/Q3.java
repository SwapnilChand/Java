import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
	    short a = sc.nextShort();//8-bit or 8 4 2 1
	    short b = sc.nextShort();
	    System.out.println("The sum of the MSBs of the given two 8 bit / 4 digit numbers  " + a + " & " + b + " is " + (a / 1000 + b / 1000));
	    sc.close();
	}

}
