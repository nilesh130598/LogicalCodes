package LogicalPrograms;

import java.util.Scanner;

public class Rwhitespaces {
	public static String removewhitespaces(String str){
		char ch[]  = str.toCharArray();
		if(str!=null){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<=ch.length-1;i++){
				int temp = ch[i];
				if(temp!=' ' && temp!='\t' ){
					sb.append(ch[i]);
				}
			
			}
			return sb.toString();
			
		}
		return null;
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String str = Rwhitespaces.removewhitespaces(s);
		System.out.println(str);
	}
}
