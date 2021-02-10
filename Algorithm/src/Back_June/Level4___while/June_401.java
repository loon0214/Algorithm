package Back_June.Level4___while;

import java.util.Scanner;

public class June_401 {	// 10952
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
			
			if(A==0 && B==0) break;
		}
	}
}
