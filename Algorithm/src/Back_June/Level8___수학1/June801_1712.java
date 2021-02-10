package Back_June.Level8___수학1;

import java.util.Scanner;

public class June801_1712 {	// 1712
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Fixed cost ? ");	
			int A = sc.nextInt(); // fixed cost
		
		System.out.println("Variable cost ? ");
			int B = sc.nextInt(); // variable cost
		
		System.out.println("Macbook Price ? ");
			int C = sc.nextInt(); // Macbook price
		
		// C * n >= A + B * n 	--> Cn >= A +Bn
		// --> Cn - Bn >= A
		// n >= A / (C - B)
		
			if(C <= B) System.out.println("-1");
			else System.out.println(A / (C - B) + 1);
		
	}
}

