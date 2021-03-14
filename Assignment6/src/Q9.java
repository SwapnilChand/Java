import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a, b, c, d");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		/*THIS IS WRONG..WE NEED TO FIND LCM ACTUALLYif(b < d) {
			dOne = a / d ; 
			dTwo = c / d;
		}
			//NOTE: SEE howwe are getting error becoz there are actually two lines
		else {
			dOne = a / b ; 
			dTwo = c / b;
		}*/
		int iMultiplier1 = multiplier1(b, d);
		int iMultiplier2 = multiplier2(b, d);
		a *= iMultiplier1;
		b *= iMultiplier1;
		c *= iMultiplier2;
		d *= iMultiplier2;
		double dOne = (double)a / (double)b, dTwo = (double)c / (double)d;
		double dSum = sum(dOne, dTwo); 
		System.out.println("Sum in terms of the smallest common denominator of a/b and c/d is " + dSum);
		sc.close();	
	}
	public static int multiplier1(int b, int d) {
		int iMultiplier1;
		if(b % d == 0) {
			iMultiplier1 = d;
			}
		else if(d % b == 0){
			iMultiplier1 = 1;
			}
		else {
		iMultiplier1 = d;
		}
		return iMultiplier1;
			 
	}
	public static int multiplier2(int b, int d) {
		int iMultiplier2;
		if(b % d == 0) {
			iMultiplier2 = 1;
			}
		else if(d % b == 0){
			iMultiplier2 = b;
			}
		else {
		iMultiplier2 = b;
		}
		return iMultiplier2;
			 
	}
	public static double sum(double a, double b) {
		return a + b;
	}

}
