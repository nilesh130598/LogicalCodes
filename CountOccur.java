package LogicalPrograms;

import java.util.Scanner;

public class CountOccur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenght of array");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int count;
		System.out.println("Enter elemenets in array");
		for(int i=0; i<=num-1; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);
		int duplicatearr[] = new int[num];
		
		for(int i=0; i<=arr.length-1; i++){
			count = 1;
			for(int j=i+1; j<=arr.length-1;j++){
				if(arr[i]!=-1){
					if(arr[i]==arr[j]){
						count++;
						arr[j] = -1;
						duplicatearr[j] = 0; 
				}
					
				}
				
			}
			duplicatearr[i] = count; 
		}
		
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]!=-1){
				System.out.println(arr[i]+" "+duplicatearr[i]);
			}
		}
	}
	

}
