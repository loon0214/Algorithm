package Back_June.Level3___for;

import java.util.Scanner;

public class June_308 { // 11021
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i + ": " + (A+B));
		}
	}
}