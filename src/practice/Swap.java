package practice;

public class Swap {
	public static void main(String[] args) {
		//swapping using third variable
		int a = 10;
		int b = 50;
		int c = 0;
		System.out.println("Before swapping");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
	}

}
