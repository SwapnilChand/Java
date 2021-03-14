import java.util.*;
public class Q10 {
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int iCtr = 0;
		for(char i = ch1; i <= ch2; i++) {
			System.out.print((char)ch1 + " ");
			iCtr++;
			if(iCtr % numberPerLine == 0) 
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending characters with the specified numbers per line");
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		int iSpace = sc.nextInt();
		printChars(c1, c2, iSpace);
		sc.close();
	}

}
