/*
 * Name : - Swapnil Chand
 * Regd.No: - 2041003008
 */
package assignment1;

public class Question11 {

	public static void main(String[] args) {
		 int a = 2147483647;
		 System.out.println(a);
		 System.out.println(a+1);
		 System.out.println(2-a);
		 System.out.println(-2-a);
		 System.out.println(7*a);//127 * 2 =254 = 127 + 1 + 126 = -128 +1 + 125 = -127 + 125 [max value * even no = - even no]
		 System.out.println(3*a);//max value * odd number = max value - (odd - 1)
		 //127 * 7 = 889 = 127 +  127 +  127 +  127 + 127 + 127 + 127 = 127 - (-2 * 3) = 127 - 6 = 121
    }

}
