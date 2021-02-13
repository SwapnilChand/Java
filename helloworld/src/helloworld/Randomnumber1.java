package helloworld;

public class Randomnumber1 {

	public static void main(String[] args) {
		// Create a random number between (0-1)
		double num1 = Math.random();
		//Random is a <pre>-defined method in the class Math
		//System.out.println(num1);
		//Generate a random number between (0-N : let N = 50)
		num1 = Math.random()*50;
		System.out.println(num1);
		//Generate a random number between min and max where min is included 
		//and max is not included
		int min = 10, max = 50;
		num1 = min + Math.random()*(max - min);//Math.random()*(max - min) 
		//will generate a number between 0 - 40
		//min + Math.random()*(max - min) this will then generate 
		//a number from 10 - 50
		System.out.println(num1);
		//random int number between min and max
		int num2 = (int)(num1);//10 is included 50 is not included
		System.out.println(num2);
		//How can we get upper limit also? simply add a 1 you dumb
		num1 = min + Math.random()*(max - min + 1);
		System.out.println(num2);


		

		

	}

}
