package Code_Up;

import java.util.Scanner;

public class a1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String part[] = s.split("[.]");
		
		System.out.println(part[0]);
		System.out.println(part[1]);
	}
}