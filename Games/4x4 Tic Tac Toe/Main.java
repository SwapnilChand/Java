import java.util.Scanner;

public class Main{
    
    public static void clearScreen() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } 

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printRulesAndIntro(){
        System.out.println("--------------------");
        System.out.println(
        " ____   _  _ \n   " +
        "| ___| | || | \n  " + 
        "|___ \\| || |_ \\n    " + 
        " ___) ||__   _| \n" + 
        "|____/    |_|   \n");
        System.out.println("--------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------");
        System.out.println("-------RULES--------");
        System.out.println("--------------------");
        System.out.println("----MATCH THREE-----");
        System.out.println("------FROM ANY------");
        System.out.println("-----DIRECTION------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("------CIRCULAR------");
        System.out.println("-------MATCHES------");
        System.out.println("----ARE ALLOWED-----");
        System.out.println("--------------------");
    }
    
    public static void printBoard(char board[][]){

        
        System.out.println(" __  __  __  __ ");
        System.out.println("| " + board[0][0] + " |"
                           + "| " + board[0][1] + " |"
                           + "| " + board[0][2] + " |"
                           + "| " + board[0][3] + " |");
        System.out.println(" __  __  __  __ ");
    
        System.out.println("| " + board[1][0] + " |"
                           + "| " + board[1][1] + " |"
                           + "| " + board[1][2] + " |"
                           + "| " + board[1][3] + " |");
        System.out.println(" __  __  __  __ ");

    
        System.out.println("| " + board[2][0] + " |"
                           + "| " + board[2][1] + " |"
                           + "| " + board[2][2] + " |"
                           + "| " + board[2][3] + " |");
        System.out.println(" __  __  __  __ ");

    
        System.out.println("| " + board[3][0] + " |"
                           + "| " + board[3][1] + " |"
                           + "| " + board[3][2] + " |"
                           + "| " + board[3][3] + " |");
        System.out.println(" __  __  __  __ ");    
    }
    
    public static boolean checkCondition(char[][] board){
        
        //vertical
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(((board[i][j] == board[i][j + 1]) && (board[i][j + 1] == board[i][j + 2])) || 
                   ((board[i][0] == board[i][2]) && (board[i][2] == board[i][3]))){
                    System.out.println(board[i][j] + " wins!");
                    return true;
                }
            }
        }

        //horizontal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(((board[i][j] == board[i + 1][j]) && (board[i + 1][j] == board[i + 2][j])) || 
                   ((board[0][j] == board[2][j]) && (board[2][j] == board[3][j]))){
                    System.out.println(board[i][j] + " wins!");
                    return true;
                }
            }
        }
        
        //diagonal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if((board[i][j] == board[i + 1][j + 1]) && (board[i + 1][j + 1] == board[i + 2][j + 2])){
                    System.out.println(board[i][j] + " wins!");
                    return true;
                }
            }
        }
        
        //antidiagonal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                
            }
        }
        
        return false;


    }
    
    public static void updateBoard(char player, int row, int column, char board[][]){
        board[row][column] = player;
    }

    public static void gameLoop(){
        //initialize
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[4][4];
        int row, column;
        //populate the entire array with empty chars so that you can later simply replace them. 
        // This will help not break the design
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        
        clearScreen();
        printRulesAndIntro();
        clearScreen();
        // player choose whether to use * or O
        System.out.println("Enter your name warrior 1");
        String name1 = sc.next();

        System.out.println("Enter your warrior character");
        char player1 = sc.next().charAt(0);

        System.out.println("Enter your name warrior 2");
        String name2 = sc.next();
        
        System.out.println("Enter your warrior character");
        char player2 = sc.next().charAt(0);


        do {
            printBoard(board);
            
            //for player 1
            System.out.println(name1 + " enter the row and column for your warrior " + player1);
            row = sc.nextInt();
            column = sc.nextInt();
            if(board[row][column] == ' '){
                System.out.println("Occupied! Try Again.");
            }
            updateBoard(player1, row, column, board);
            clearScreen();
            printBoard(board);
            
            //for player 2
            System.out.println(name2 + " enter the row and column for your warrior " + player2);
            row = sc.nextInt();
            column = sc.nextInt();
            if(board[row][column] == ' '){
                System.out.println("Occupied! Try Again.");
                //recursive call to a method - takeValues
            }
            else{}           
            updateBoard(player2, row, column, board);
            clearScreen();
            
            // after both players have entered their responses check if anyone wins
            // if yes then print their name, show the board, break the do-while loop
            // if(checkCondition(board))
            //     break;
            } while (true);

        
    }
    public static void main(String[] args) {
        gameLoop();

    }
}