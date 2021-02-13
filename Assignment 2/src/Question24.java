
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = Math.random(), num2 = Math.random(), num3 = Math.random(), num4 = Math.random(), num5 = Math.random();
		
		double min = Math.min(num1 , Math.min(num2, Math.min(num3, Math.min(num4, num5))));
		double max = Math.max(num1 , Math.max(num2, Math.max(num3, Math.max(num4, num5))));
		double avg = (num1 + num2 + num3 + num4 + num5) / 5 ;
		System.out.println("The numbers are - \n" + num1 +"\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5 + "\n" + "Maximum :- " + max + "\nMinimum :- " + min + "\nAverage :- " + avg);


	}

}
