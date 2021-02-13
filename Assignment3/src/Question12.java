import java.util.*;
public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers:");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		if(i1 <= i2 && i1 <= i3) {
			if(i2 <= i3) 
				System.out.println("Display the integers in non-decreasing order: " + i1 + " " + i2 + " " + i3);
			else
				System.out.println("Display the integers in non-decreasing order: " + i1 + " " + i3 + " " + i2);
		}
		else if(i2 <= i1 && i2 <= i3) {
			if(i1 <= i3) 
				System.out.println("Display the integers in non-decreasing order: " + i2 + " " + i1 + " " + i3);
			else
				System.out.println("Display the integers in non-decreasing order: " + i2 + " " + i3 + " " + i1);
		}
		else if(i3 <= i1 && i3 <= i2) {
			if(i1 <= i2) 
				System.out.println("Display the integers in non-decreasing order: " + i3 + " " + i1 + " " + i2);
			else
				System.out.println("Display the integers in non-decreasing order: " + i3 + " " + i2 + " " + i1);
		}
		else
			System.out.println("Enter coreect numbers of int type.");
		sc.close();
	}
}
