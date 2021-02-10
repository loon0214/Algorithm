package Back_June.Level3___for;

import java.util.Scanner;

public class June_311 { // 10871
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// how many times ?
		int X = sc.nextInt();	// less than X
		int a[] = new int[N];
		
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(a[i] < X)
				System.out.print(a[i] + " ");
		}
	}
}