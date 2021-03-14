/*// If a year is multiple of 400, 
    // then it is a leap year 
    if (year % 400 == 0) 
        return true; 
 
    // Else If a year is multiple of 100, 
    // then it is not a leap year 
    if (year % 100 == 0) 
        return false; 
 
    // Else If a year is multiple of 4, 
    // then it is a leap year 
    if (year % 4 == 0) 
        return true; 
    return false; 
 * 
 */

public class Q4 {
	public static int main (int i) {
		int iLeap = 366, iNLeap = 365; 
		if (i % 400 == 0)  
			return iLeap;
		else if(i % 100 == 0)
			return iNLeap;
		else if(i % 4 == 0)
			return iLeap;
		else
			return iNLeap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iYear;
		for(int i = 2000; i <= 2020 ;i++) {
			iYear = main(i);//why (int i) gives an error ?
			System.out.println(iYear);
		}
	}

}
