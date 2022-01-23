package LogicalPrograms;

public class MaxValue {
       public static void main(String[] args) {
		int arr[] = {1,7,91,12,57};
		int maxno=0;
		for(int i=0;i<=arr.length-1;i++){
			if(maxno<arr[i]){
				maxno=arr[i];
			}
		}
		System.out.println(maxno);
	}
}
