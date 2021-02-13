import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input two integers");
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = (int)(a + ((b - a)*Math.random()));
	    ;
	    System.out.println("Result = " + c);
	}

}
