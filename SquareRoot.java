package LogicalPrograms;

import java.util.Scanner;

public class SquareRoot {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	for(int i=1; i<num;i++){
		int sum = i*i;
		if(sum==num){
			System.out.println("square root is "+i);
			break;
		}
		
	}
	double d = Math.sqrt(num);
	System.out.println(d);

}
}
