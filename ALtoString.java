package LogicalPrograms;

import java.util.ArrayList;

public class ALtoString {
   public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("nilesh");
	al.add("rahul");
	al.add("suraj");
	al.add("dipu");
	al.add("sai");
	
	String arr[] = new String[al.size()];
	for(int i=0;i<=al.size()-1;i++){
		arr[i] = al.get(i);
	}
	
	System.out.println(al);
	for(String ar:arr){
		System.out.println(ar);
	}
}
}
