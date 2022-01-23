package LogicalPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int a;
		int reverseno = 0;
		int temp = num;
		while(num!=0){
//			seperate last integer
			a= num%10;
			reverseno = reverseno*10 + a;
//			remove last element
			num = num/10;
			}
		if(temp==reverseno){
			System.out.println("Given no is palindrome");
		}
		else{
			System.out.println("Given no is not palindrome");
		}
	}
}
