package myPack2;

import java.util.Scanner;

public class Assignment2 {
	static int[] markArray = new int[5];
	int[] getMarks() {
		Scanner SC = new Scanner(System.in);
		for(int i = 0; i <= 4; i++) {
			System.out.println("Enter Values For Subject " + (1 + i));
			markArray[i] = SC.nextInt();
		}
		return markArray;
	}
	
	int calMarks(){
		int totalMarks = 0;
		totalMarks = markArray[0] + markArray[1] + markArray[2] + markArray[3] + markArray[4];
		System.out.println("Total Marks = " + totalMarks);
		return totalMarks;
	}
	
	void DisplayClass(){
		String status = "";
		float Precent = (float)calMarks() *100/500;
		if (Precent< 40) {
			status = "fail";
		}else if(Precent > 40 && Precent < 60) {
			status = "3 rd";
		}else if(Precent > 60 && Precent < 80) {
			status = "2 nd";
		}else if (Precent > 80) {
			status = "1 st";
		}
		System.out.println("Student Class is " + status);
	}
	
	
	public static void main(String[] args) {
		Assignment2 Mp = new Assignment2();
		Mp.getMarks();
		Mp.DisplayClass();
	}

}
