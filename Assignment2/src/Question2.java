
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Input three integers");
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean bool = ((a <= (b + c)) || (b <= (a + c)) || (c <=(a + b)));
    System.out.println("Result = " + bool);
    sc.close();
	}

}
