import java.util.*;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the base");// 4
		int x = sc.nextInt();
		System.out.println("Enter the value of the exponent");//3
		int y = sc.nextInt();
		int z = (int)Math.pow(x , y);
		int tPlace = (z % 10); //ten's place's digit = 4
		int hPlace = ((z % 100) - tPlace) / 10;//hundred's place's digit = (64 - 4) / 10 = 6
		System.out.println("The sum of last two digits of x ^ y is " + (tPlace + hPlace));
		 
	}

}
