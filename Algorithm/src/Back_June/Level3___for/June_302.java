package Back_June.Level3___for;

import java.util.Scanner;

public class June_302 { // 10950
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // how many times ?
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
		
			System.out.print(A+B);
		}
	}
}
