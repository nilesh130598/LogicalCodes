package LogicalPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountOccur1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for(int i = 0; i<=ch.length-1;i++){
			if(hs.containsKey(ch[i])){
				hs.put(ch[i], hs.get(ch[i])+1);
			}
			else{
			hs.put(ch[i], 1);
			}
			
			}
		Set<Entry<Character, Integer>> ms = hs.entrySet();
		Iterator mi = ms.iterator();
		while(mi.hasNext()){
			Map.Entry mape = (Entry) mi.next();
			Integer keyvalue = (Integer) mape.getValue();
			char key = (char) mape.getKey();
			System.out.println(key+" "+keyvalue);
		}
	}}


