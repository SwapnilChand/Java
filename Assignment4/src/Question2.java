
public class Question2 {

	public static void main(String[] args) {
		// Command line args for the number of times hello will be displayed
		int iTimes = Integer.valueOf(args[0]);
		String sMessage = "Hello";
		int i = 1 , n ;
		while(i <= iTimes) {
			n = i;
		/*while(n % 100 == 20) {
		System.out.println(i + "th " + sMessage);
		i++;
		continue;
			}
		OR cAN WE USE 	
		((n % 100 == 11 | 12 | 13))	
		INSTEAD OF
		((n % 100 == 11) || (n % 100 == 12) ||( n % 100 == 13))
		*/
			if((n % 100 == 11) || (n % 100 == 12) ||( n % 100 == 13))
				System.out.println(i + "th " + sMessage);
			else if (n % 10 == 1)
				System.out.println(i + "st " + sMessage);
			else if(n % 10 == 2)
				System.out.println(i + "nd " + sMessage);
			else if(n % 10 == 3)
				System.out.println(i + "rd " + sMessage);
			else 
				System.out.println(i + "th " + sMessage);
			i++;
		
		}
	}

}
