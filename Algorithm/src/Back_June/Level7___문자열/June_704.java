package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_704 {	// 2675
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // how many times ?
		for(int i=1; i<=t; i++) {
			
			int r = sc.nextInt(); // how many repeat?
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=1; k <= r; k++) {		// print till Repeat
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}