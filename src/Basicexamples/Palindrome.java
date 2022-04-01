package Basicexamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("The palindrome of number or string is ");
		original=s.nextLine();
		int length=original.length();
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+original.charAt(i);
		}
		System.out.println("The reverse string is "+rev);
		if(original.equals(rev)) {
			System.out.println("The value is palindrome ");
		}
		else {
			System.out.println("the number is not palindrome");
		}

			

	}

}
