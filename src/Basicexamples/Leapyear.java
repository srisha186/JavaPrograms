package Basicexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year=s.nextInt();
		
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			System.out.println("The value is leap year ");
		}
		else {
			System.out.println("the number is not leap year");
		}

			

	}

}
