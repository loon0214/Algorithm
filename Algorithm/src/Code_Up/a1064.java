package Code_Up;

import java.util.Scanner;

public class a1064 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		System.out.println((x>y?y:x)<z?(x>y?y:x):z);
	}
}