package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_703 {	// 10809
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		for(char c='a'; c<='z'; c++) {
			System.out.print(x.indexOf(c) + " ");
		}
	}
}