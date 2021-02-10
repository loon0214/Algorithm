package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_710 { // 1316
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // how many times ?
		int count = 0;

		while (n-- > 0) { // repeat till n == 0
			String s = sc.next(); // type the words.
			int[] check = new int[26];	// compare with 26 alphabets [A - Z]

			count++; // first of all, just ++

			for (int i = 1; i < s.length(); i++) {

				if (s.charAt(i) != s.charAt(i - 1)) {
					check[s.charAt(i - 1) - 97] = -1;

					if (check[s.charAt(i) - 97] == -1) { // if there are previous one
						count--;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}