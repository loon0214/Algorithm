package Back_June.Level8___수학1;

import java.util.Scanner;

public class June802_2839 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // how many boxes ?
		
		if(N==1 || N==2 || N==4 || N==7) System.out.println("-1");
		else if (N%5 == 0) 		 	  	 System.out.println(N/5);
		else if (N%5 == 1 || N%5 == 3)   System.out.println(N/5 + 1);
		else if (N%5 == 2 || N%5 == 4)	 System.out.println(N/5 + 2);
	}
}