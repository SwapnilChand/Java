public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String bool = (a % b == 0 ) || (b % a == 0) ? "true" : " ";
		System.out.println(bool);
	}

}
