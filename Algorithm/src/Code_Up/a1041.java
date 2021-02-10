package Code_Up;

import java.util.Scanner;

public class a1041 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char word = sc.next().charAt(0); // A
//		int i = (int)word;				 // 65
//		int next = i+1; 				//66
//		char plus = (char)next;			//B
//		
//		System.out.println(plus);
		
		System.out.println((char)(word+1));
	}
}