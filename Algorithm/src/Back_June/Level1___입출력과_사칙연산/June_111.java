package Back_June.Level1___입출력과_사칙연산;

import java.util.Scanner;

public class June_111 {	// 2588
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A * (B%10));
		System.out.println(A * (B%100/10));
		System.out.println(A * (B/100));
		System.out.println(A * B);
	}
}
