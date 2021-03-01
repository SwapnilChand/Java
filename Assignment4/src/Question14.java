import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long N = sc.nextInt(), lN = 0, l;
		sc.close();
		for (l = 0 ;((long)(Math.pow(2, l)) <= N) ; l++) 
			lN = l;
		//if((long)(Math.pow(2, l)) <= N)
		System.out.println("The largest power of two less than or equal to " + N + " = " + lN);
		
	}

}
