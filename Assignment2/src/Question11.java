import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input three integer value ");
		java.util.Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int min = Math.min(a, b);
	    int x = Math.min(min, c);
	    int max = Math.max(a, b);
	    int z = Math.max(max, c);
	    int middle =((a + b + c)-(x + z));
	    System.out.println(x + "\n" + middle + "\n" + z);
	    
	}

}
