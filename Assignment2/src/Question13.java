import java.util.Scanner;
public class Question13 {

public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input age:");
            int a = sc.nextInt();
            System.out.println("Input height(ft):");
            int ft = sc.nextInt();
            System.out.println("Input height(inch):");
            int inch = sc.nextInt();
            System.out.println("Input weight:");
            int w = sc.nextInt();
            System.out.println("So, you're " + a + "years old, " + ft + "'" + inch + "\"" + " tall and " + w + "Kg heavy.");
        }
}