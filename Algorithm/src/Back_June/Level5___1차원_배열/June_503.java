package Back_June.Level5___1차원_배열;

import java.util.Scanner;

public class June_503 { // 2577
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int n = A * B * C;
		int count[] = new int[10];

		while(n > 0) {
			count[n % 10]++;
			n /= 10;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}	
	}
}