package Back_June.Level5___1차원_배열;

import java.util.Scanner;

public class June_507 { // 4344
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();	// how many case ?
		int[] score = new int[1000];	// each student's score
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();	 // how many students ?
			int sum = 0;	// total scores
			int count = 0;	// how many scores which more than average.
			
			for(int j=0; j<n; j++) {
				score[j] = sc.nextInt();	// each student's score.
				sum += score[j];			// total score.
			}
			double avg = (double) sum / n;	
			
			for(int j=0; j<n; j++) {
				if(score[j] > avg)
					count++;
		}
		System.out.printf("%.3f", 100.0 * count / n);
		System.out.println("%");
		}
	}
}