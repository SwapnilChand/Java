import java.util.*;
public class Q13 {
	public static int isPalindrome(int i, int y) {
		int check;
		if(i == y)
			check = 1;
		else 
			check = 0;
		return check;
		
		/*
		int check;//boolean check ;
		for(int i = 0,j = sStr.length() - 1; i <= sStr.length() / 2 && j <= sStr.length() / 2 + 1; i++, j++){
			if(sStr.charAt(i) == sStr.charAt(j))
				check = 1;//true;
			else 
				check = 2;//false;
		}
		return check;
		*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//""
		/*	System.out.println("Enter a string");
		String sStr = sc.nextLine();
		boolean b = isPalindrome(sStr);
		if(b == true)
			System.out.println("The string is a palindrome.");
		else 
			System.out.println("The string is not a palindrome.");

		sc.close();	*/
		int i = sc.nextInt();
		int u = isPalindrome(i,i);
		System.out.println(u);
		sc.close();
	}

}
