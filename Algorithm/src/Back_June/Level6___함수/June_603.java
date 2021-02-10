package Back_June.Level6___함수;

import java.util.Scanner;

public class June_603 {	// 1065
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		
		if(x < 100) {
			System.out.println(x);
			return;
		}
		
		count = 99;
		
		for(int i=100; i<=x; i++) {
			int a = i/100;
			int b = (i/10)%10;
			int c = i%10;
			
			if(a-b == b-c)
				count++;
		}
		System.out.println(count);
	}	
}

