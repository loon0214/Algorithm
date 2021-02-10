package Back_June.Level4___while;

import java.util.Scanner;

public class June_402 {	// 10951
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}
