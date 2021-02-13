import java.util.*;
public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 15");
		int iNum = sc.nextInt();//9
		int exp = 0;
		int n = 10 ^ exp ,iRemNew;
		
		int iNew = iNum / 2;//9 / 2 = 4
		int iRem = (iNum % iNew);//9 % 4 = 1
		iNum = iNew;//iNum = 4
		iRem = iRem + iRem * n;//1 + 1 * 0 = 1
		iRemNew = iRem;// iRemNew = 1
		exp++;// n = 10
		
		iNew = iNum / 2;//4 / 2 = 2
		iRem = (iNum % iNew);//4 % 2 = 0
		iNum = iNew;//iNum = 2
		iRem = iRemNew + iRem * n;// 1 + 00 = 1
		iRemNew = iRem;// iRemNew = 1
		exp++;// n = 100
		
		iNew = iNum / 2;//2 / 2 = 1 
		iRem = (iNum % iNew);//2 % 1 = 0
		iNum = iNew;//iNum = 1
		iRem = iRemNew + iRem * n;// 1 + 000 = 1
		iRemNew = iRem;// iRemNew = 1
		exp++;// n = 1000
		
		iNew = iNum / 2;// 1 / 2 = 0 
		if(iNum == 1)
			iRem = 1;	
		else
			iRem = (iNum % iNew);//1 % 0 = 1
		
		iNum = iNew;
		iRem = iRem + iRem * n;// 1 + 1 * 1000 = 1001
		
		System.out.println("The binary form is " + iRem);
			
		sc.close();
		}
	}
