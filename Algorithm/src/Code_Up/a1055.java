package Code_Up;

import java.util.Scanner;

public class a1055 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x == 1 || y == 1)
			System.out.println(1);
		else
			System.out.println(0);
	}
}