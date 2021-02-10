package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_705 {	// 1157
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase();	// lower letter -> capital
		int count [] = new int[26];			// alphabet = 26
		
		int max = 0;
		char result = '?';
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i) -'A']++;
			if(max < count[s.charAt(i) - 'A']) {
			   max = count[s.charAt(i) - 'A'];
			   result = s.charAt(i);
			} else if(max == count[s.charAt(i) -'A']) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}