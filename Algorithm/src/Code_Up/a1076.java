package Code_Up;

import java.util.Scanner;

public class a1076 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char word = sc.next().charAt(0);
		char zero = 'a';
		do {
			System.out.println(zero);
			zero += 1;
		} while(zero <= word);
	}
}