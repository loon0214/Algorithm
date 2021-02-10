package Back_June.Level8___수학1;

import java.util.Scanner;

public class June805_2869 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int up 	 = sc.nextInt();
		int down = sc.nextInt();
		int h	 = sc.nextInt();
		
//		long x = (h - down) / (up - down);
//		if((h - down) % (up - down) != 0) x++;
//		
//		System.out.println(x);
		
		// 5 - 1 / 2 - 1 -> 4/1 = 4 
		
		long x = (h-down) / (up-down);
		if((h-down) % (up-down) != 0) x++;
		System.out.println(x);
		
	}
}