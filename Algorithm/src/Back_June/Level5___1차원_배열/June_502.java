package Back_June.Level5___1차원_배열;

import java.util.Scanner;

public class June_502 { // 2562
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int count = 0;
		int n[] = new int[9];
		
		for(int i=0; i<9; i++) {
			n[i] = sc.nextInt();
			
			if(n[i] > max) {
				max = n[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
