package helloworld;

public class CharMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Character.isLetter('A'))
			System.out.println("Entered character is a letter");
		else
			System.out.println("Entered character is not a letter");
		if(Character.isDigit('5'))
			System.out.println("Entered character is a digit");
		else
			System.out.println("Entered character is not a digit");
		if(Character.isWhitespace(' '))
			System.out.println("Entered character is a whitespace");
		else
			System.out.println("Entered character is not a whitespace");
		if(Character.isUpperCase('A'))
			System.out.println("Entered character is a uppercase");
		else
			System.out.println("Entered character is not a uppercase");
		if(Character.isLowerCase('a'))
			System.out.println("Entered character is a lowercase");
		else
			System.out.println("Entered character is not a lowercase");
		System.out.println(Character.toUpperCase(' '));
		System.out.println(Character.toLowerCase(' '));
		System.out.println(Character.toString('9'));

		
		
	}

}
