package helloworld;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -10;double b = 3.234;
		double real = a % b;
		//int res1 = a + b;
		//int res2 = a - b;
		//int res3 = a * b;
		//int res4 = a / b;
		double res5 = a - b * (int)(a/b);//[a - (3 * 2) = 6 - 6 = 0] a % b;
		//System.out.println(a + " + " + b + " = " + res1);
		//System.out.println(a + " - " + b + " = " + res2);
		//System.out.println(a + " * " + b + " = " + res3);
		//System.out.println(a + " / " + b + " = " + res4);
		System.out.println(a + " % " + b + " = " + res5 + " check " + real);
	}

}
