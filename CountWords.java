package LogicalPrograms;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		String str = "Samsung vivo micromax jio vodafone";
//		String arr[] = str.split(" ");
//		System.out.println(arr.length);
//		System.out.println();
        
//		str = str.replace("\\s", "");
//		System.out.println(str);
		
		   
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");

	    // take the input
	    String input = sc.nextLine();
	    System.out.println("Original String: " + input);

	    // remove white spaces
	    
	    input = input.replaceAll("\\s", "");
	    System.out.println("Final String: " + input);
	    sc.close();
	}
	

}
