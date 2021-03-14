
public class Q7 {
	public static boolean isTwinPrime(int iFirst, int iSecond) {
		boolean iNumOne = isPrime(iFirst);
		boolean iNumTwo = isPrime(iSecond);
		if(iNumOne && iNumTwo == true)
			return true;
		else 
			return false;
	}

	public static boolean isPrime(int iNum) {
		int ctr = 0;
		for(int i = 1; i <= iNum; i++)
		{
			if(iNum % i == 0) 
				ctr++;
		}
		if(ctr == 2)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 1000; i++){
		if (isTwinPrime(i , i + 2) == true)
			System.out.println("(" + i + ", "+ (i + 2) + ")" );
			
		}
	}

}
