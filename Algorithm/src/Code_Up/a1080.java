package Code_Up;

import java.util.Scanner;

public class a1080 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		if(1000 >= i && i >= 0) {
			while(sum < i) {
				count++;
				sum += count;
			}
		}
		System.out.println(count);
	}
}