package myPack;

import java.util.Scanner;

public class arthamaticTest {
	static int Num1 = 0;
	static int Num2 = 0;
	int Val = 0;
	void addition() {
		System.out.println("Numbwe " + Num1 + " + Number " + Num2 + " =" + (Num1 + Num2));
	}
	void multiplication() {
		System.out.println("Numbwe " + Num1 + " * Number " + Num2 + " =" + (Num1 * Num2));
	}
	
	void subtract() {
		System.out.println("Numbwe " + Num1 + " - Number " + Num2 + " =" + (Num1 - Num2));
	}
	
	void divide() {
		System.out.println("Numbwe " + Num1 + " / Number " + Num2 + " =" + (Num1 / Num2));
	}
	
	static void percentage() {
		System.out.println("Numbwe " + Num1 + " % Number " + Num2 + " =" + (Num1 % Num2));
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		Num1 = SC.nextInt();
		Num2 = SC.nextInt();
		arthamaticTest AF = new arthamaticTest();
		// Adding 2 Numbers
		AF.addition();
		// Percentage Of Two Numbers
		percentage();
	}

}
