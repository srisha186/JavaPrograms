package Basicexamples;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=54678,reverse=0;
		while(number!=0) {
			
		int remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		System.out.println("The reverse numbers are "+reverse);			

	}

}
