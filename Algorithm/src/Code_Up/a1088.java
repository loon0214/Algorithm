package Code_Up;

import java.util.Scanner;

public class a1088 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(100>=x && x>=1) 
			for(int i=1; i<=x; i++) {
				if(i%3==0) continue;
				System.out.println(i);
			
		}
	}
}