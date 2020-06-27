package myPack2;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner readLine = new Scanner(System.in);
		System.out.println("Enter Value To Test Cases");
		String Ovel = readLine.next();
/*		switch(Ovel.toUpperCase())
		{
		case "A":
			System.out.println("You Have Entered a Vowels");
			break;
		case "E":
			System.out.println("You Have Entered a Vowels");
			break;
		case "I":
			System.out.println("You Have Entered a Vowels");
			break;
		case "O":
			System.out.println("You Have Entered a Vowels");
			break;
		case "U":
			System.out.println("You Have Entered a Vowels");
			break;
		default:
			System.out.println("Wrong You Have Not Entered a Vowels");
		}
*/
		switch(Ovel.toUpperCase())
		{
		case "A": case "E": case "I": case "O": case "U":
			System.out.println("You Have Entered a Vowels");
			break;
		default:
			System.out.println("Wrong You Have Not Entered a Vowels");
		}
	}

}
