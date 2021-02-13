import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius : ");
		double celsius = sc.nextDouble();
		double F = (9.0/5) * celsius + 32;
		System.out.println("The value in Fahrenheit is : " + F);
     	sc.close();
	}

}
