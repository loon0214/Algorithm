package Back_June.Level3___for;

import java.util.Scanner;

public class June_301 { // 2739
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.printf(N + " * " + i + " = " + N*i +"\n");
		}
	}
}
