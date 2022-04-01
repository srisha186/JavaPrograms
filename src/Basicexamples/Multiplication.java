package Basicexamples;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10, 20);
		Multiplication calc=new Multiplication();
		calc.sub(30, 20);
		calc.multiply(28.3,30.3);
		divide(75.4,54.3);
		
	}
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("The added numbers are "+c);
	}
	
	void sub(int x,int y) {
		int z=x-y;
		System.out.println("The Subtracted numbers are "+z);
	}
	
	public void multiply(double d,double e) {
		double z=d*e;
		System.out.println("The Multiplied numbers are "+z);

	}
	public static void divide(double h,double j) {
		double y=h*j;
		System.out.println("The divided numbers are "+y);

	


	}

}
