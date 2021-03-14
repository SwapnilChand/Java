import java.util.*;
public class Q12 {

	public static int vowelCounter(String sStr) {
		int iCtr = 0;
		char[] cVowel = {'a','e','i','o','u'};
		for(int i = 0; i <= sStr.length() - 1; i++) {
			for(int j = 0; j <= 4; j++) {
				if(cVowel[j] == sStr.charAt(i))
					iCtr++;
			}
		}
		return iCtr++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String sStr = sc.nextLine();
		int iCtr = vowelCounter(sStr);
		System.out.println("The number of vowels in " + sStr + " is " + iCtr);
		sc.close();
	}

}
