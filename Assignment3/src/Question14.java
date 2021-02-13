import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2):");
		int iUser = sc.nextInt();
		int iComp = (int)(Math.random() * 2);
		String sObjC = null, sObjU = null;
		switch(iComp) {
		case 0:
			sObjC = "scissor";
			break;
		case 1:
			sObjC = "rock";
			break;
		case 2:
			sObjC = "paper";
			break;
		}
		switch(iUser) {
		case 0:
			sObjU = "scissor";
			break;
		case 1:
			sObjU = "rock";
			break;
		case 2:
			sObjU = "paper";
			break;
		}
		if (iUser == iComp) {
			System.out.println("The computer is " + sObjC + ". You are " + sObjU + " too. It is a draw");
		}
		else if((iUser == 0 && iComp == 1)||(iUser == 1 && iComp == 2)||(iUser == 2 && iComp == 3)){
			System.out.println("The computer is " + sObjC + ". You are " + sObjU + ". You lost");
		}
		else if((iComp == 0 && iUser == 1)||(iComp == 1 && iUser == 2)||(iComp == 2 && iUser == 3)) {
			System.out.println("The computer is " + sObjC + ". You are " + sObjU + ". You won");
		}
		sc.close();
		
	}

}
