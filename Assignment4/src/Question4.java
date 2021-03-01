import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Count from: ");
		int i1 = sc.nextInt();
		System.out.println("Count to: ");
		int i2 = sc.nextInt();
		System.out.println("Count by: ");
		int i3 = sc.nextInt();
		for( ; i1 <= i2 ; i1 += i3)
			System.out.println(i1);
		
		sc.close();											
	}

}
