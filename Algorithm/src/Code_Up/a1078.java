package Code_Up;

import java.util.Scanner;

public class a1078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int sum =0;
		
		for(int i=0; i<=number; i++) {
			if(i%2==0)
			{sum+=i;}
		}
		System.out.println(sum);
	}
}