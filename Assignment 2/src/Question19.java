
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dSal = Double.parseDouble(args[0]); // Salary from cmd line
		double dDA = (0.4 * dSal);
		double dHRA = (0.2 * dDA);
		System.out.println("Gross salary is Rs." + (dSal - (dDA + dHRA)));
	}

}
