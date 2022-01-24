package LogicalPrograms;

import java.util.ArrayList;

public class ArraytoArrayList {
	public static void main(String[] args) {
		int arr[] = {3,4,1,6,8,2,4,5,6,9,7,5};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<=arr.length-1;i++){
			al.add(i, arr[i]);
		}
//		System.out.println(al);
		int temp;
		for(int i=0;i<=al.size()-1;i++){
			for(int j=i+1;j<=al.size()-1;j++){
				if(al.get(i)>al.get(j)){
					temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
						}
//				swapping of numbers
				
			}
			
		}
		System.out.println(al);
	}

}
