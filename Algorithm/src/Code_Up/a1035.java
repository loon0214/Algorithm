package Code_Up;

import java.util.Scanner;

public class a1035 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		
		// a -> hex
		int a = Integer.parseInt(hex, 16);

		// 16 -> 8 octal (%o)
		System.out.printf("%o", a);
		
	}
}