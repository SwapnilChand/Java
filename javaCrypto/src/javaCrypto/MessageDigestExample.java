package javaCrypto;
import java.security.MessageDigest;
import java.util.Scanner;

public class MessageDigestExample {

	public static void main(String[] args) throws Exception{
		// reading from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		String message = sc.nextLine();
		
		//creating object
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		
		md.update(message.getBytes());
		
		//Compute the message digest
		byte[] digest = md.digest();
		
		System.out.println(digest);
		
		//converting byte to hexstring format
		StringBuffer hexString = new StringBuffer();
		for(int i = 0;i < digest.length ;i++) {
			hexString.append(Integer.toHexString(0xFF & digest[i]));
			
		}
		System.out.println("Hex format : " + hexString.toString());
		
	}

}
