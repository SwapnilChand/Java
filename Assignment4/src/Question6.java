
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000 ; i <= 2000 ; i++) {
			System.out.print(i + " ");
			int n = i % 10;
			if(n == 5 || n == 0)
			System.out.println();
		}
	}

}
