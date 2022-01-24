package LogicalPrograms;

import java.util.Scanner;

public class ReverseArray {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int arr[] = new int [size];
	System.out.println("Enter elements of array");
	for(int i=0;i<=arr.length-1;i++){
		arr[i]= sc.nextInt();
	}
	for(int i=0;i<=arr.length-1;i++){
		System.out.print(arr[i]);
	}
	int i = 0;
	int arr1[]= new int[size];
	for(int j=arr.length-1;j>=0;j--){
		arr1[i] = arr[j];
		i++;
	}
	for(int j=0;j<=arr.length-1;j++){
		System.out.print(arr1[j]);
	}
	
}
   
}
