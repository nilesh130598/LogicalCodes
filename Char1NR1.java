package LogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Char1NR1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		char ch = firstnonrepatingchar(str);
		System.out.println("The first non repeated character is :  " + ch);
		
		
	}
	public static Character firstnonrepatingchar(String s){
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		char ch[] = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++){
			char ch1 = s.charAt(i);
			if(hs.containsKey(ch1)){
				hs.put(ch1, hs.get(ch1)+1);
			}
			else{
				hs.put(ch1, 1);
			}
		}
		for(Entry<Character, Integer> entry: hs.entrySet()){
			if(entry.getValue()==1){
				return entry.getKey();
			}
			
		}
		return null;
		
	}

}
