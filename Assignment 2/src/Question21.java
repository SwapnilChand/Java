public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double t = Double.valueOf(args[0]);
	    double b = Math.toRadians(t);
	    double c = Math.sin(2 * b) + Math.sin(3 * b);
	    System.out.println("sin(2t) + sin(3t) = " + c);	    
	}

}
