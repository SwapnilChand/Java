import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double dHeight = sc.nextDouble();
		double dWeight = sc.nextDouble();
		double dBMI = dWeight / (dHeight * dHeight);
		if (dBMI < 18.5) 
			System.out.println("underweight");
		else if ( dBMI >= 18.5 && dBMI <= 24.9)
			System.out.println("normal weight");
		else if ( dBMI >= 25.0 && dBMI <= 29.9)
			System.out.println("overweight");
		else if ( dBMI >= 30.0)
			System.out.println("obese");
		
		sc.close();
	}

}
