
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		System.out.println((int)(a + (Math.random()*(b - a + 1))));

	}

}
