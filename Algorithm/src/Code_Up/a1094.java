package Code_Up;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a1094 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// how many times ?
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			int num = sc.nextInt(); // random No.
			list.add(num);
		}
		
		Collections.reverse(list);
		
		for(int i=0; i<n; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}