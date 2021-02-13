import java.util.*;
public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lowercase character .");
		char c = sc.next().charAt(0);
		System.out.println("The uppercase equivalent of the lowercase character is : " + (char)(c - 32));
		sc.close();
	}

}
