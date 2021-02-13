import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double dNumFeet = sc.nextDouble();
		double dNumMeter = dNumFeet * 0.305;
		System.out.println(dNumFeet + " feet is " + dNumMeter +" meters");
		sc.close();
	}

}
