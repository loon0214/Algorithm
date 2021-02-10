
package Code_Up;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a1095 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.print(Collections.min(list));
	}
}