package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HStoArrayList {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("nilesh");
		hs.add("suraj");
		hs.add("dipu");
		hs.add("kamini");
		hs.add("sai");
		hs.add("rahul");
		hs.add("sai");
//		System.out.println("Before converting");
//		for(String s:hs){
//			System.out.println(s);
//		}
		System.out.println("After converting to arraylist");
		ArrayList<String> al = new ArrayList<>(hs);
		for(String ss:al){
			System.out.println(ss);
		}
	}

}
