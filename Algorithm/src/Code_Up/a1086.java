package Code_Up;

import java.util.Scanner;

public class a1086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int rgb = sc.nextInt();
		double sum = 0;
		
		if( 1024>=w && w>1 && 
			1024>=h && h>1 && 
			40>=rgb && rgb>=0 && rgb%4==0) {
			sum = w * h * rgb;
		}
		
		double result = ( (sum/8) / Math.pow(2, 10) / Math.pow(2, 10));
		System.out.printf("%.2f MB", result);
	}
}