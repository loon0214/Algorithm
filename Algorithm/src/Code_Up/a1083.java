package Code_Up;

import java.util.Scanner;

public class a1083 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i=0; i<=a; i++)
			if(i%3 == 0) System.out.println("X ");
			else System.out.println(i+" ");
	}
}