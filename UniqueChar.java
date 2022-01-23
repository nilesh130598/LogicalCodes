package LogicalPrograms;

import java.util.Scanner;

public class UniqueChar {
  static String unique(String str){
	  char ch[] = str.toCharArray();
	  for(int i = 0; i<str.length()-1;i++){
		  for(int j=i+1; j<str.length(); j++){
			  
			  if(ch[i]==ch[j]){
				  String s1 = "given is not unique";
				  return s1;
			  }
			  else{
				  return "given is unique";
			  }
		  }
		  
	  }
	  return null;
  }
  
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a key");
	 String s = sc.nextLine();
	String s1 = UniqueChar.unique(s);
	System.out.println(s1);
}
}
  
