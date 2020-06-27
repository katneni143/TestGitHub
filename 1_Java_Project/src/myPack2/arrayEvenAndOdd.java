package myPack2;

import java.util.Scanner;

public class arrayEvenAndOdd {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		String evenAll = "";
		String oddAll = "";
		Scanner SC = new Scanner(System.in);
		int intArr[] = new int[10];
		for (int i = 0; i < 9; i++) 
		{
			intArr[i] = SC.nextInt();
		}

		for(int j = 0; j < 9; j ++) 
		{
			if(intArr[j]%2 == 0) 
			{
				evenAll = evenAll + " " + intArr[j];
				even = even + intArr[j];
			}
			else 
			{
				oddAll = oddAll + " " + intArr[j]; 
				odd = odd + intArr[j];
			}
		}

		System.out.println("Even Number total = " + even + " And All Values Are " + evenAll);
		System.out.println("Odd Number total = " + odd+ " And All Values Are " + oddAll);

		for(int i= 0; i <= 9; i ++) 
		{
			if(i%2 == 0)
			{
				evenAll = evenAll + " " + i;
				even = even + intArr[i];
			}
			else
			{
				oddAll = oddAll + " " + i; 
				odd = odd + intArr[i];
			}
		}
		System.out.println("Even Number total = " + even + " And Position Values " + evenAll);
		System.out.println("Odd Number total = " + odd+ " And Position Values " + oddAll);
	}
}
