import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TicTacToeGameJva {
	static ArrayList<Integer> playerPositions;
	static ArrayList<Integer> cpuPositions;

	public static void main(String[] args) {
    public static void playTicTacToe() {
    	//printing the game board
    	char[][] board = {  {' ','|',' ','|',' '},
    						{'-','|','-','|','-'},
    						{' ','|',' ','|',' '},
    						{'-','|','-','|','-'},
    						{' ','|',' ','|',' '},
    						{'-','|','-','|','-'},
    						{' ','|',' ','|',' '},};
    		                                  
    
    
    };

	}

	Scanner scn = new Scanner(System.in);
	
	System.out.println("Where do you wanna place 'X' ? Enter position ");
	int userpos = scn.nextInt();
	
	while(!validPos(userPos)) {
		System.out.println("Position taken, try another position");
		userPos = scn.nextLine();
		
	}
	placePiece(board, userPos, "player");
	//check
	String res = checkWin();
	if (res.length() > 0) {
		printBoard(board);
		System.out.println(res);
		break;
	}


}}
