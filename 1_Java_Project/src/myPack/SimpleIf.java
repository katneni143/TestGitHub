package myPack;

import java.util.Scanner;

public class SimpleIf {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 5;
		if (num1 > num2) 
		{
			System.out.println("Num 1 is Grater Then Num 2");
		}else {
			System.out.println("Num 2 is Grater Then Num 1");
		}
		
		
		Scanner read = new Scanner(System.in);
		/*int num3 = read.nextInt();
		int num4 = read.nextInt();
		System.out.println(num3 + num4);
		System.out.println(read.nextInt() + read.nextInt());
		*/
		/*
		 * This 
		 * is
		 * a
		 * test
		 * for 
		 * comments
		 * 
		 */

		int num3 = read.nextInt();
		int num4 = read.nextInt();
		if (num3 > num4) 
		{
			System.out.println("Num 1 is Grater Then Num 2");
		}else {
			System.out.println("Num 2 is Grater Then Num 1");
		}
	}

}
