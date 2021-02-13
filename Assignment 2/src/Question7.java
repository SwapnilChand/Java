import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side: ");
		float fSide = sc.nextFloat();
		float fArea = (3 *((float)Math.pow( 3 , 0.5)) * fSide * fSide) / 2;
		System.out.println("The area of the hexagon is " + fArea);
		sc.close();
		
	}

}
