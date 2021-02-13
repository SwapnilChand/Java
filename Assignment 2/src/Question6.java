import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double dW = sc.nextDouble();
		System.out.println("Enter height in inches:");
		double dH = sc.nextDouble();
		dW = dW * 0.45359237;
		dH = dH * 0.0254;
		float dBMI = (float)(dW / (dH * dH));
		System.out.println("BMI is " + dBMI);
		sc.close();

	}

}
