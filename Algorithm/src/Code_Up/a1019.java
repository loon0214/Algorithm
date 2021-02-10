package Code_Up;

import java.util.Scanner;

public class a1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		// split -> seperate by . -> save in arrays
		// [.] or \\.
		String date[] = a.split("[.]");
		
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.println(String.format("%04d.%02d.%02d", year, month, day));
	}
}