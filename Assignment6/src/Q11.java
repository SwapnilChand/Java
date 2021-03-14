import java.util.*;
public class Q11 {
	public static int count(String str, char a) {
		int iCtr = 0;
		for(int i = 0; i <= (str.length() - 1); i++) {
			char c = str.charAt(i);
			if(c == a)
				iCtr++;
		}
		return iCtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string followed by a character whose number of occurrences you want to count");
		String sS = sc.next();
		char cChar = sc.next().charAt(0);
		int iOccur = count(sS, cChar);
		System.out.println("The number of occurrences of " + cChar + " in " + sS + " is " + iOccur);
		sc.close();
	}

}
