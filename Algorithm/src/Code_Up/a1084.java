package Code_Up;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a1084 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		int r = sc.nextInt();
//		int g = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<g; j++) {
//				for(int k=0; k<b; k++) {
//					System.out.println(i+" "+j+" "+k);
//					sum++;
//				}
//			}
//		}
//		System.out.println(sum);
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String a = br.readLine();
				int count = 0;
				String[] b = a.split(" ");
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
					for (int i = 0; i < Integer.valueOf(b[0]); i++) {
						for (int j = 0; j < Integer.valueOf(b[1]); j++) {
							for (int k = 0; k < Integer.valueOf(b[2]); k++) {
								bw.write(i + " " + j + " " + k + "\n");
								count++;
							}
						}
					}
				bw.write(String.valueOf(count));
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}