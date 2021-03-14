import java.util.*;
public class Q2 {

	public static int getPentagonalNumber (int n) {
		int r = n * (3 * n - 1)/2;
		return r;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0 , iNum;
		for (int n = 1; n <= 100; n++) {
			iNum = getPentagonalNumber(n);
			System.out.print(iNum + " ");
			count++;
			if (count % 10 == 0) {
				count = 0;
				System.out.println();
			}
			sc.close();
			
		}
		
	}
	

}




