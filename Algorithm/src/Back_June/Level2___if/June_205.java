package Back_June.Level2___if;

import java.util.Scanner;

public class June_205 { // 2884
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();	// hour
		int M = sc.nextInt();	// minute
		
		M -= 45;
		if(0 > M) {
			if(H != 0) {
				H -= 1;
				M += 60;
			}
			else {
				H = 23;
				M += 60;
			}
		}
		System.out.println(H + " " + M);
	}
}