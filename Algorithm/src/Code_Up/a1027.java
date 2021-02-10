package Code_Up;

import java.util.Scanner;

public class a1027 {

	public static void main(String[] args) {
		
		Scanner sc   = new Scanner(System.in);
		String s     = sc.next();
		String[] all = s.split("[.]");
		
		int year  = Integer.parseInt(all[0]);
		int month = Integer.parseInt(all[1]);
		int day   = Integer.parseInt(all[2]);
		
		System.out.printf("%02d-%02d-%04d",day, month, year);
	}
}