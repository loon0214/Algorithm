package Back_June.Level8___수학1;

import java.util.Scanner;

public class June804_1193 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 

		// int x[] = {1, 1,2, 3,2,1, 1,2,3,4, 5,4,3,2,1, ...... };
		// int y[] = {1, 2,1, 1,2,3, 4,3,2,1, 1,2,3,4,5, ...... };
		
		int max = 0;
		int line = 0;
		
		for(int i=1; i<=n; i++) {
			max += i;
			if(max >= n) {
				line = i;
				break;
			}
		}				
				
		if(line %2 == 0) System.out.println( (line-(max-n))+"/"+(1+max-n) );
		else 			 System.out.println( (1+max-n)+"/"+(line-(max-n)) );
	}
}