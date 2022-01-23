package LogicalPrograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no you want series of");
		int no  = sc.nextInt();
		int a = 1;
		int b = 2;
		
		for(int i=0; i<=no; i++){
			int c =  a + b;
			System.out.println(c);
			a = b;
			b = c;
			
			
		}
	}

}
