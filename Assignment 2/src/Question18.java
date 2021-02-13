
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.valueOf(args[0]);
		double y = Double.valueOf(args[1]);
		double z = Double.valueOf(args[2]);
		System.out.println((((x < y) && (y < z)) || ((x < y) && (y < z)))?true:false);

	  

	}

}
/*in the above case even if we r using same values for x and y the answer gives false*/