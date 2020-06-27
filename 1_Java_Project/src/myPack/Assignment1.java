package myPack;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner getText = new Scanner(System.in);
		System.out.println("Enter Number 1");
		float Num1 = getText.nextInt();
		
		System.out.println("Enter Number 2");
		float Num2 = getText.nextInt();
		
		if(Num1 > Num2)
			System.out.println("Number " + Num1 + " Is Grater Than " + Num2);
		else
			System.out.println("Number " + Num2 + " Is Grater Than " + Num1);
	}

}
