package LogicalPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinktoArrayList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("mango");
		ll.add("Pineapple");
		ll.add("chiku");
		ll.add("banana");
		System.out.println("New arraylist is");
		ArrayList<String> al = new ArrayList<>(ll);
		for(String fruit:al){
			System.out.println(fruit);
		}
	}

}
