package Code_Up;

import java.util.Scanner;

public class a1045 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		double X = (double)x;
		System.out.printf("%.2f",X/y);
	}
}