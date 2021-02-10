package Code_Up;

import java.util.Scanner;

public class a1089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int f = sc.nextInt(); // 첫번째 
		int d = sc.nextInt(); // 등차 
		int n = sc.nextInt(); // 몇 번째 ?
		int last = 0;
		
		if( 100>=f && f>=0 &&
			100>=d && d>=0 &&
			100>=n && n>=0)
			
			last = f + d*(n-1);
			System.out.println(last);
		}
	}
