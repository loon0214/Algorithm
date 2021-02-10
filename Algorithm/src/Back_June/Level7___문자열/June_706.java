package Back_June.Level7___문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class June_706 {	// 1152
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		StringTokenizer s = new StringTokenizer(sentence, " ");
		System.out.println(s.countTokens());
	}
}