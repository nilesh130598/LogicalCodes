package LogicalPrograms;

import java.util.Scanner;

public class SwapNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
//		using 3rd variable
//		System.out.println("Before swapping a is "+a +" & b is "+b);
//	    c = a;
//	    a = b;
//	    b = c;
//	    System.out.println("After swapping a is "+a +" & b is "+b);
		
//		without using 3rd varible
		System.out.println("Before swapping a is "+a +" & b is "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping a is "+a +" & b is "+b);
	}

}
