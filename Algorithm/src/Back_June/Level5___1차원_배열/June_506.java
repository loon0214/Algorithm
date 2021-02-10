package Back_June.Level5___1차원_배열;

import java.util.Scanner;

public class June_506 { // 8958
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s;
		
		for(int i=0; i<n; i++) {
			s = sc.next();
			int count = 0;
			int sum =0;
			
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else
					count = 0;
			}
			System.out.println(sum);
		}
	}
}