package Back_June.Level2___if;

import java.util.Scanner;

public class June_202 { // 9498
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
//		if(100>=score && score >=90) System.out.println("A");
//		if(89>=score && score >=80) System.out.println("B");
//		if(79>=score && score >=70) System.out.println("C");
//		if(69>=score && score >=60) System.out.println("D");
//		if(60>score) System.out.println("F");	
	
		if(100>=score && score >=90) System.out.println("A");
		else if(89>=score && score >=80) System.out.println("B");
		else if(79>=score && score >=70) System.out.println("C");
		else if(69>=score && score >=60) System.out.println("D");
		else System.out.println("F");
	}
}
