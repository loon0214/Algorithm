package Back_June.Level5___1차원_배열;

import java.util.Arrays;
import java.util.Scanner;

public class June_501 { // 10818
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // how many numbers ?
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[n-1]);
	}
}
