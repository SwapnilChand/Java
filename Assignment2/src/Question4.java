import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input an integer 1-6 ");
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = a + (int)((b - a)*Math.random());
	    int d = a + (int)((b - a)*Math.random());
	    System.out.println("Result = " + (c+d));
	}

}
//DOUBT