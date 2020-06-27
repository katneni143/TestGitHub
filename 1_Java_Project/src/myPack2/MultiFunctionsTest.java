package myPack2;

import java.util.Scanner;

public class MultiFunctionsTest {

	static String getText(String Test) {
		System.out.println("String Function");
		Scanner SC = new Scanner(System.in);
		Test = SC.next();
		return Test;
	}
	
	static int getText(int Test) {
		System.out.println("Int Function");
		Scanner SC = new Scanner(System.in);
		Test = SC.nextInt();
		return Test;
	}
	static void printText() {
		System.out.println( "Entered Value = " + getText(null));
		System.out.println("Enter Nuber = " + getText(12));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printText();
		
	}
}
