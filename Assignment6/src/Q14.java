import java.util.*;
public class Q14 {
	public static boolean isValid (String sStr) {
		int iDigitCtr = 0;
		boolean b = false;
		if(sStr.length() >= 8)
			for(int i = 0 ;i <= sStr.length() - 1; i++) {
				for(int j = 0 ;j <= 9; j++) {
					int[] iDigits = {0,1,2,3,4,5,6,7,8,9};
					if(sStr.charAt(i) == iDigits[j])
						iDigitCtr++;
				}
				if(iDigitCtr >= 2){
					if((sStr.charAt(i) >= 65 && sStr.charAt(i) <= 90) || (sStr.charAt(i) >= 97 && sStr.charAt(i) <= 122))
						b = true;
					else 
						b = false;
				}
				else
					b = false;	
			}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		String sStr = sc.next();
		boolean b = isValid(sStr);
		if(b == true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		sc.close();
	}

}
