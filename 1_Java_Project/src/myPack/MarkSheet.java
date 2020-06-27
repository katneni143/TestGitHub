package myPack;

import java.util.Scanner;

public class MarkSheet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int Sub1 = read.nextInt();
		int Sub2 = read.nextInt();
		int Sub3 = read.nextInt();
		int Sub4 = read.nextInt();
		int Sub5 = read.nextInt();
		int Total = Sub1 + Sub2 +Sub3 + Sub4 + Sub5;
		float per = (float)Total*100/500;
		if(Sub1 > 30 && Sub2 > 30 && Sub3 > 30 && Sub4 > 30 && Sub5 > 30) {
			if(per >=90) {
				System.out.println("First Class " + per + "%");
			}else  if(per >=50 && per < 90 ) {
				System.out.println("Second Class " + per + "%");
			}else if(per >=30 && per <= 50 ) {
				System.out.println("Third Class " + per + "%");
			}
		}else {
			System.out.println("Student Fail");
		}
	}

}
