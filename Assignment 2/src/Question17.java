
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);
		System.out.println((Boolean)((a >= (b + c))||(b >= (a + c))||(c >= (a + b)))); 
		
	}

}
