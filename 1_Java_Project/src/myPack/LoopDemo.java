package myPack;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {

//		for(int i = 1; i <= 10; i = i+1) {
//			
//			System.out.println("2 * " + i + " = " + 2*i + "    " + "3 * " + i + " = " + 3*i);
//		}
		@SuppressWarnings("resource")
		Scanner getText = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int Num1 = getText.nextInt();
		String Even = "";
		String Odd = "";
		for (int i = 0; i <= Num1; i ++)
		{
			if(i%2 == 0) {
				Even = Even + " " + i;
			}else if(i%2 != 0){
				Odd = Odd +  " " + i;
			}
		}
		System.out.println("Even Number" + Even);
		System.out.println("Odd Numner " + Odd);
//		if ( Num1 % 2 == 0 ) 
//		{
//			System.out.println("Number Is Even");
//		}else{
//			System.out.println("Number Is Odd");
//		}
	}

}
