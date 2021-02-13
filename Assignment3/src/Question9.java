public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1, max = 12, num1;
		num1 = min + (int)Math.random()*(max - min);
		System.out.println("THE RANDOM NUMBER IS " + num1 + "and the month :");
		switch(num1)
		{
		case 1:
			System.out.println("Its january.");
			break;
		case 2:
			System.out.println("Its february.");
			break;
		case 3:
			System.out.println("Its march.");
			break;
		case 4:
			System.out.println("Its april.");
			break;
		case 5:
			System.out.println("Its may.");
			break;
		case 6:
			System.out.println("Its june.");
			break;
		case 7:
			System.out.println("Its july.");
			break;
		case 8:
			System.out.println("Its agust.");
			break;
		case 9:
			System.out.println("Its september.");
			break;
		case 10:
			System.out.println("Its october.");
			break;
		case 11:
			System.out.println("Its november.");
			break;
		case 12:
			System.out.println("Its december.");
			break;
		}

	}
}