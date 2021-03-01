
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iSum = 0,iSqu,n;
		for (int i = 1;i <=10; i++)
		{	n = i * i;
			iSum = n + iSum;			
		}
		System.out.println("The sum of the squares of the first ten natural numbers is,\r\n"
				+ "1 ^ 2 + 2 ^ 2 + ... + 10 ^ 2 = " + iSum);
		iSum = 0;
		for (int i = 1;i <=10; i++)
		{	
			iSum = i + iSum;			
		}
		iSqu = (iSum * iSum);
		System.out.println("The square of the sum of the first ten natural numbers is,(1 + 2 + ... + 10) ^ 2 = 55 ^ 2 =" + iSqu);
		System.out.println("Hence the difference between the sum of the squares of the firstten natural numbers and the square of the sum is 3025 − 385 = " + (iSqu - iSum));
		
	}

}
