/*An integer n is divisible by 9 if the sum of its digits is divisible by 9. Write a java program
to display each digit, starting with the rightmost digit.
Your program should also determine whether or not the number is divisible by 9. Test it
on the following numbers:
n = 154368
n = 621594
n = 123456
Hint: Use the % operator to get each digit; then use / to remove
that digit. So 154368 % 10 gives 8 and 154368 / 10 gives 15436.
The next digit extracted should be 6, then 3 and so on.
 */
import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		int iRem = 0, iSum = 0;
		while(iNum >= 0) {
			
			iRem = iNum % 10;
			
			if (iNum == 0){
				System.out.println( "\nThe sum of the digits is " + iSum);
				if(iSum % 9 == 0)
				System.out.println("The number is divisible by 9");
				else
					System.out.println("The number is not divisible by 9");
				break;
				}
			else{
				System.out.print(iRem + " ");	
				iNum /= 10; }
			iSum += iRem;
		}
		
		sc.close();
	}

}
