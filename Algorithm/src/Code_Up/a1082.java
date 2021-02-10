package Code_Up;

import java.util.Scanner;

public class a1082 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(16);
		
		for(int b=1; b<16; b++){
			System.out.printf("%X*%X=%X \n",a,b,a*b);
		}		
	}
}