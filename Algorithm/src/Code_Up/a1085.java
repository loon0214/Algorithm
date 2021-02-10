package Code_Up;

import java.util.Scanner;

public class a1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long h = sc.nextLong();	// Hz
		long b = sc.nextLong();	// bit
		long c = sc.nextLong();	// channel
		long s = sc.nextLong();	// record time (second)
		double sum = 0;
		
		if( 48000>= h && h>0 && 
			32 >= b && b>0 && b%8==0 && 
			5>=c && c>0 && 
			6000>=s && s>0) {
			sum = h * b * c * s;
		}
		
		// Math.pow(밑, 지수) a의 b승
		// 8 bit == 1 byte -> (h * b * c * s)/8 
		// 1024 byte == 1 kB
		// 1024 kB   == 1 MB
		double result = ((sum/8) / Math.pow(2, 10) / Math.pow(2, 10));
		System.out.printf("%.1f MB", result);
	}
}