package Code_Up;

import java.util.Scanner;

public class a1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] str = s.split("-");
		
		String jeden = str[0];
		String dwa = str[1];
		
		System.out.println(jeden + dwa);
	}
}
