package Back_June.Level5___1차원_배열;

import java.util.Scanner;

public class June_505 { // 1546
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 	// how many subjects ?
		int sum = 0;			// total score
		int max = 0;			// Maximum score from subjects
		
		for(int i=1; i<=n; i++) {
			int score = sc.nextInt();
		
		if(score > max)
			max = score;
			sum += score;
		}
		double avg = (double) sum / (double) max * 100 / n;
		System.out.println(avg); // fake avg.

		
	}
}