public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the value upto which you want to find the multiples.");
	int iULim = Integer.parseInt(args[0]);
	int iSum = 0;
	
	for (int i = 1 ; i < iULim ; i++) {
		if (i % 3 == 0  || i % 5 == 0)
			iSum += i;
		else
			continue;
	}
	System.out.println(iSum);
	
	}

}