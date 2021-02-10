package Code_Up;

import java.util.Scanner;

public class a1087 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		
		if(100000000>=x && x>0) {
			for(int i=0; ; i++) {
				sum+=i;
				if(sum>=x) break;
			}
		}
		System.out.println(sum);
	}
}