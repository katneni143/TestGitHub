package myPack2;
import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		String names[] = new String[5];
		names[0] = "AA";
		names[1] = "BB";
		names[2] = "CC";
		names[3] = "DD";
		names[4] = "EE";
		Scanner NS = new Scanner(System.in);
		//int srrSize = NS.nextInt();
		int arrNew[] = new int[9];
		for (int i =0; i <9; i++) {
			arrNew[i] = NS.nextInt();
		}
		for (int i = 0; i <9; i++) {
			System.out.println("Value in " + i + " = " + arrNew[i]);
		}
	}
}



//arrNew[0] = NS.nextInt();
//arrNew[1] = NS.nextInt();
//arrNew[2] = NS.nextInt();
//arrNew[3] = NS.nextInt();
//arrNew[4] = NS.nextInt();
//arrNew[5] = NS.nextInt();
//arrNew[6] = NS.nextInt();
//arrNew[7] = NS.nextInt();
//arrNew[8] = NS.nextInt();
//arrNew[9] = NS.nextInt();
//
//System.out.println("Int 1 = " + arrNew[0]);
//System.out.println("Int 2 = " + arrNew[1]);
//System.out.println("Int 3 = " + arrNew[2]);
//System.out.println("Int 4 = " + arrNew[3]);
//System.out.println("Int 5 = " + arrNew[4]);
//System.out.println("Int 6 = " + arrNew[5]);
//System.out.println("Int 7 = " + arrNew[6]);
//System.out.println("Int 8 = " + arrNew[7]);
//System.out.println("Int 9 = " + arrNew[8]);
//System.out.println("Int 10 = " + arrNew[9]);

