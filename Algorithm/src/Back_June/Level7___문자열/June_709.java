package Back_June.Level7___문자열;

import java.util.Scanner;

public class June_709 {	// 2941
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String croatia[] =
			{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String s = sc.next();
		
		for(int i=0; i<8; i++)
			s = s.replace(croatia[i], "a");
		
		System.out.println(s.length());
	}
}