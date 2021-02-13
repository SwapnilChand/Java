package helloworld;

public class IntegerLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decnum = 26;
		int octnum = 026;
		int hexnum = 0xA;
		int binum = 0b11010;
		System.out.println("decimal value = " + decnum);
		System.out.println("octal value = " + octnum);
		System.out.println("hexadecimal value = " + hexnum);
		System.out.println("binary value = " + binum);
		System.out.println(Integer.toHexString(hexnum));
		System.out.println(Integer.toOctalString(octnum));
		System.out.println(Integer.toBinaryString(binum));
		double d1 = 1.23, d2 = 1.23e-2;
		float f1 = 1.23f;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);


	}

}
