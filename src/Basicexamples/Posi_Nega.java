package Basicexamples;

import java.util.Scanner;

public class Posi_Nega {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=s.nextInt();
		if(a>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}

	}

}
