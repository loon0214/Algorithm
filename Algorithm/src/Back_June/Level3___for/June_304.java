package Back_June.Level3___for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class June_304 { // 15552
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=0; i<n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
		}
		bw.close();
	}
}