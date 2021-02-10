package Code_Up;

import java.util.Scanner;

public class a1091 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();	// 시작 값 
		long m = sc.nextLong();	// 곱할 값 
		long d = sc.nextLong();	// 더할 값 
		long n = sc.nextLong();	// 몇번째 정수인가?
		
		if( 50>=a && a >= -50 &&
			50>=m && m >= -50 &&
			50>=d && d >= -50 &&
			10 >= n)
			
			for(int i=1; i<n; i++) {
				a = (a * m)+d;
			}
			System.out.println(a);
	}
}