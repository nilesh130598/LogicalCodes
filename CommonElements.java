package LogicalPrograms;

public class CommonElements {
	public static void main(String[] args) {
		int arr[] = {1,4,7, 9, 2};
		int arr1[] = {1,7,3,4,5};
		
		for(int i = 0; i<=arr.length-1; i++){
			
			for(int j = 0; j<=arr1.length-1;j++){
				
				if(arr[i]==arr1[j]){
					System.out.println(arr[i]);
				}
				
			}
		}
	}

}
