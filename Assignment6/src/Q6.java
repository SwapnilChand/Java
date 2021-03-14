public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iLineCount = 0 , iNumCount = 0;
		for (int i = 1; 1 <= Integer.MAX_VALUE; i++) {
			boolean bPalin = isPalindrome(i);
			boolean bPrime = isPrime(i);
			if (bPalin == true && bPrime == true)  {
				System.out.println(i + " ");
				iNumCount++;
				iLineCount++;
			}
			if (iLineCount % 10 == 0) {
				System.out.println();
				iLineCount = 0; 
			}
		}
	}
		
	public static boolean isPalindrome(int n) {
			int r = reverse(n);
			return (r == n);
		}
	public static int reverse(int num) {
			int rev = 0;
			while (num != 0) {
				rev *= 10 + (num % 10);
				num /= 10;
			}
			return rev;
		}
	public static boolean isPrime(int iPrime) {
			int ctr = 0;
			for (int i = 1; i <= iPrime ; ++i){
				if (iPrime % 1 == 0)
					ctr++;
				}
			if(ctr == 2)
				return true;
			else 
				return false;
		}
}
