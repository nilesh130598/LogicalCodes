package LogicalPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList {
   public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("Apple");
	al.add("Amazon");
	al.add("Facebook");
	al.add("Google");
	al.add("IBM");
	al.add("Tesla");
	System.out.println(al);
	ArrayList<String> al1 = new ArrayList<>();
	int j = 0;
	System.out.println(al.size());
	for(int i=al.size()-1;i>=0;i--){
		al1.add(j,al.get(i));
		j++;
	}
	System.out.println(al1);
//	
//	for(int i =0; i<=al.size()-1;i++){
//		System.out.print(" "+al.get(i));
//	}
//	Iterator itr = al.iterator();
//	while(itr.hasNext()){
//		System.out.println(itr.next());
//	}
	ListIterator l = al.listIterator();
    System.out.println("Forward direction:");
    while(l.hasNext())
      System.out.println("Value: " + l.next() + " Index: " + l.nextIndex());
    
    System.out.println("Reverse direction:");
    while(l.hasPrevious())
      System.out.println("Value: " + l.previous() + " Index: " + l.previousIndex());
  }
}

