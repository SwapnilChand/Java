package helloworld;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numi = Integer.parseInt(args[0]);
		int num1 = Integer.valueOf(args[0]);
		System.out.println(numi);
		System.out.println(num1);
		
		float numf = Float.parseFloat(args[1]);
		float numf1 = Float.valueOf(args[1]);
		System.out.println(numf);
		System.out.println(numf1);
		
		double numd = Double.parseDouble(args[2]);
		double numd1 = Double.valueOf(args[2]);
		System.out.println(numd);
		System.out.println(numd1);
		int num3 = Integer.parseInt("AA" , 16);
		System.out.println(num3);
		

	
	    
	}

}
