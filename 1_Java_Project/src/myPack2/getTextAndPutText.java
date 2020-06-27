package myPack2;

import java.util.Scanner;

public class getTextAndPutText {

	static String getText() {
		Scanner SC = new Scanner(System.in);
		String Text1;
		Text1 = SC.next();
		return Text1;
	}
	
	static void printText() {
		System.out.println("System Out  = " + getText());
	}
	
	public static void main(String[] args) {
		printText();
	}

}

