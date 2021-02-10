package Back_June.Level1___입출력과_사칙연산;

import java.util.Scanner;

public class June_105 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, sum;
		
		System.out.println("type the Number A");
		A = sc.nextInt();
		System.out.println("type the Number B");
		B = sc.nextInt();

		sum = A + B;
		System.out.printf("therefore, A + B = " + sum);
		
	}

}
