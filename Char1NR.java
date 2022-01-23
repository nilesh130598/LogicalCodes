package LogicalPrograms;

import java.util.Scanner;

public class Char1NR {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String str = sc.nextLine();
//	char ch1 = 0;
	
//	char ch[] = str.toCharArray();
	
//	for(int i=0;i<=ch.length-1; i++){
//		int count = 0;
//		char ch2 = 0;
//		for(int j=i;j<=ch.length-1;j++){
//			if(ch[i]==ch[j]){
//				 count++;
//			     }
//			}
//		if(count!=0){
//			System.out.println("hiii");
//			ch2 = ch[i];
//			System.out.println("first non repeated character is "+ch2);
//			break;
//		}
//		
	for(char i:str.toCharArray()){
		if(str.indexOf(i)==str.lastIndexOf(i)){
			System.out.println("First non repeating character is: "+i);
		}
	}
	
	}
	

		
	}


