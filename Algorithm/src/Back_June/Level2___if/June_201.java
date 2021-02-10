package Back_June.Level2___if;

import java.util.Scanner;

public class June_201 { // 1330
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {System.out.println(">");}
		if(A < B) {System.out.println("<");}
		if(A == B) {System.out.println("==");}
	}
}
