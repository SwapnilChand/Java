import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Enter a number");
		Scanner sc = new Scanner (System.in);
		int iNum = sc.nextInt();
		boolean p = isPalindrome(iNum);
		if(p == true)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
		sc.close();
	}
	
	public static boolean isPalindrome (int n) {
		int r = reverse(n);
		return (r == n);
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);//why rev *= 10 + (num % 10) = 0...since rev = rev * (10 + (num % 10) ) 
			num /= 10;
			System.out.println(rev);
		}
		System.out.println(rev);
		return rev;
		

	}

}
