import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the temperature of your city is Fahrenheit degrees ");
		double F = sc.nextInt();
		double C = (((F -32)*5)/9);
		System.out.println("The temperature of your city is Celsius degrees is " + C + "C");	
	}

}
