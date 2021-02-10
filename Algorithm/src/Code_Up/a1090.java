package Code_Up;

import java.util.Scanner;

public class a1090 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();	// 시작 값 
		long r = sc.nextLong();	// 등비의 값 
		long n = sc.nextLong();	// 몇번째 정수인가?
		long last = 0;
		
		last = (long) (a * (Math.pow(r, (n-1))));
		System.out.println(last);
	}
}