package Code_Up;

import java.util.Scanner;

public class a1092 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int day = 1;
		
		if( 100 >= a && a > 0  &&
			100 >= b && b > 0  &&
			100 >= c && c > 0)
			
			while(day%a!=0 || day%b!=0 || day%c!=0)
			{	day++;	 }
			System.out.println(day);			
	}
}