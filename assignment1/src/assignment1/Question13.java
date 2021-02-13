/*
 * Name : - Swapnil Chand
 * Regd.No: - 2041003008
 */
package assignment1;

public class Question13 {

	public static void main(String[] args) {
		String ruler1 = "1",ruler2 = " 2 ";
		System.out.println(ruler1);//1
		ruler1 = ruler1 + ruler2 + ruler1;
		System.out.println(ruler1);//1 2 1
		ruler2 = " 3 ";
		ruler1 = ruler1 + ruler2 + ruler1;
		System.out.println(ruler1);//1 2 1 3 1 2 1
		ruler2 = " 4 ";
		ruler1 = ruler1 + ruler2 + ruler1;
		System.out.println(ruler1);//1 2 1 3 1 2 1 4 1 2 1 3 1 2 1


		

	}

}

