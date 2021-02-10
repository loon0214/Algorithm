package Back_June.Level5___1차원_배열;

import java.util.HashSet;
import java.util.Scanner;

public class June_504 { // 3052
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>(); // 중복 값 저장 x

		for(int i=0; i<10; i++) {
			hs.add(sc.nextInt()%42);
		}
		System.out.println(hs.size());
	}
}