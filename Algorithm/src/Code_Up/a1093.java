package Code_Up;

import java.util.Scanner;

public class a1093 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 부른 횟수 
		int[] arr = new int[24];	// 0 ~ 23 
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			arr[num -1] += 1;
		}
		
		for(int i=0; i<23; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}