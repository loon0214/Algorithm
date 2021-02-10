package Code_Up;

import java.util.Scanner;

public class a1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] all = s.split("[:]");
		
		int i = Integer.parseInt(all[1]);
		
		if(i<=9)
			System.out.printf("%1d", i);
		else
			System.out.printf("%d", i);
	}
}