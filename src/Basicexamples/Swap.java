package Basicexamples;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=s.nextInt();
		
		System.out.println("Enter the value ");
		int b=s.nextInt();
		int x;
		x=a;
		a=b;
		b=x;
		 
		 System.out.println("The swapped numbers are " +a+"and "+b);
		
		

		

	}

}
