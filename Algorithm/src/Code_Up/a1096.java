
package Code_Up;

import java.util.Scanner;

public class a1096 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] go = new int[20][20];
		System.out.println("how many times do you want to put ?");
		int n = sc.nextInt();
		
		System.out.println("put the X Y on the table");
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			go[x-1][y-1] = 1;
		}
		for(int i=0; i<go.length-1; i++) {
			for(int j=0; j<go.length-1; j++) {
				System.out.print(go[i][j] + " ");
			}
			System.out.println();
		}
	}
}