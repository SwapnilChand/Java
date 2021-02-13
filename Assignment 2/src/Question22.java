
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t = Double.valueOf(args[0]);
		double P = Double.valueOf(args[1]);
		double r = Double.valueOf(args[2]);
		System.out.println("Principal = " + P + "\nTime = " + t + "\nRate = " + r);
		System.out.println("INTEREST = " + (P * (Math.exp(r * t))));//pow(e,r*t);
		//Formula = P * (e ^ (r * t))
	}

}
