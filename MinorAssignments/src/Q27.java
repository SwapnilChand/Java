import java.util.*;
public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		String s = i % 2 == 0 ? "TRUE":"FALSE";
		System.out.println(s);
		sc.close();
	}

}
