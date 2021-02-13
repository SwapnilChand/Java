import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int a = sc.nextInt();//205
		int sum = 0;
		sum += a % 10;// sum = sum + 5 = 5
		a = a / 10;// a = 205 / 10 = 20
		sum += a % 10;// sum = sum + 20 % 10 = 5 + 0 
		a = a / 10;//a = 20 / 10 = 2
		sum += a % 10;// sum = sum + a % 10 = 5 + 0 + 2 = 7
		a = a / 10;//a = 2 / 10 = 0
		sum += a % 10;// sum = 7 + 0 % 10 = 7 + 0 
		a = a / 10;// 0 % 10 = 0
		System.out.println("The sum of the digits is " + sum);
		sc.close();
	}

}
