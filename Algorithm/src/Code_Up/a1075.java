package Code_Up;

import java.util.Scanner;

public class a1075 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		if(100 >= count && count >= 1) {
			for(int i=count-1; i>=0; i--) {
				System.out.println(i);
			}
		}
	}
}