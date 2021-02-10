package Code_Up;

import java.util.Scanner;

public class a1034 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String pal = sc.next();
		
		// 8 octal -> 10 decimal
		//Integer.parseInt(String, 원하는 진법);
		int i = Integer.parseInt(pal, 8);

		System.out.println(i);
	}
}