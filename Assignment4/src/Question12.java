
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("log N   N\tN logN\tN ^ 2 \tN ^ 3   2 ^ N ");
		for(long N = 16; N <= 2048; N *= 2)
		{
			System.out.println((long)Math.log10(N) + "\t" + N + "\t" + (N * (long)Math.log10(N)) + "\t" + N * N + "\t" + N * N * N + "\t" + (long)Math.pow(2,N));
		}
	}//reason for 2048x2048x2048 = 0 for int datatype

}
