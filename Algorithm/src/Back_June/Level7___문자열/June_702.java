package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_702 {	// 11720
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // how many times ?
		String x = sc.next(); // type the any number.
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += x.charAt(i) - '0';
		}
		System.out.println(sum);

	}
}