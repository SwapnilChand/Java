public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check whether its fibbonaci in the cmd line args .");
		double n = Double.parseDouble(args[0]);
		double c1 = 5 * n * n + 4;
		double c2 = 5 * n * n - 4;
		if (((c1 % 10 == 0) || (c1 % 10 == 1) || (c1 % 10 == 4) || (c1 % 10 == 5) || (c1 % 10 == 6) || (c1 % 10 == 9)) || ((c2 % 10 == 0) || (c2 % 10 == 1) || (c2 % 10 == 4) || (c2 % 10 == 5) || (c2 % 10 == 6) || (c2 % 10 == 9))){
			System.out.println("Its a fibonacci number .");
		}
		else {
			System.out.println("Its a not fibonacci number .");
		}
	}

}
