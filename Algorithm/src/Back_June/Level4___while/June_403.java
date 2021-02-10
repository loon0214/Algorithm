package Back_June.Level4___while;

import java.util.Scanner;

public class June_403 {	// 1110
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = n/10;
		int b = n%10;
		int temp = 0;
		int count = 0;
		
		while(true) {
			count++;
			
			temp = b;
			b = (a+b)%10;
			a = temp;
			
			if(n == a*10 + b) break;
		}
		System.out.println(count);
	}
}