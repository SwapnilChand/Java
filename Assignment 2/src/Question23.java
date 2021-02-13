
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int i1 = Integer.valueOf(args[0]), i2 = Integer.valueOf(args[1]), i3 = Integer.valueOf(args[2]);
		int min = Math.min(i1, Math.min(i2, i3));
	    int max = Math.max(i1, Math.max(i2, i3));	    
	    int middle = ((i1 + i2 + i3)-(max + min));
	    System.out.println(min + "\n" + middle + "\n" + max);

	}

}
