package Code_Up;

import java.util.Scanner;

public class a1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int nums[] = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			nums[i] = s.charAt(i)-'0';
		}
		
		System.out.println("[" + nums[0]*10000 +"]");
		System.out.println("[" + nums[1]*1000 +"]");
		System.out.println("[" + nums[2]*100 +"]");
		System.out.println("[" + nums[3]*10 +"]");
		System.out.println("[" + nums[4] +"]");
		}		
	}
