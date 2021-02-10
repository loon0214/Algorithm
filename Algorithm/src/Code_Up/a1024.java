package Code_Up;

import java.util.Scanner;

public class a1024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char longs[] = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			longs[i] = s.charAt(i);
		}
		for(char i:longs) {
			System.out.println("'" + i + "'");
		}		
	}
}
		

