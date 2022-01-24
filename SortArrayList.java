package LogicalPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Nilesh", 1));
		al.add(new Student("Rahul", 3));
		al.add(new Student("Suraj", 2));
		al.add(new Student("dipu", 6));
		al.add(new Student("kamini", 4));
		al.add(new Student("sai", 5));
		
		System.out.println("Before Sorting:"
				+ " Iterating ArrayList\n");

		for(int i=0;i<=al.size()-1;i++){
			Student stu = al.get(i);
			System.out.println(stu.rno);
			System.out.println(stu.nanme);
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting:"
				+ " Iterating ArrayList\n");

		for(int i=0;i<=al.size()-1;i++){
			Student stu = al.get(i);
			System.out.println(stu.rno);
			System.out.println(stu.nanme);
		}
	}

}
