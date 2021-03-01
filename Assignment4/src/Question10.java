import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table:"); 
		int iNum = sc.nextInt();
		for (int i = 0; i <= 10 ;i++)
			System.out.println(iNum + "x" + i + "=" + i * iNum);
		sc.close(); 
	}

}
