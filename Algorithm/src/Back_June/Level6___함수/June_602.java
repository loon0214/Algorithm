package Back_June.Level6___함수;

public class June_602 {	// 4673
	public static void main(String[] args) { self_number(); }
		
	public static void self_number() {
		int n = 0;	// self Number
		boolean a[] = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			n = i+ i/1000 + (i/100)%10 + (i/10)%10 +i%10;
			if(n > 10000)
				n = 0;
			a[n] = true;
		}
		
		for(int i=1; i<10000; i++) {
			if(!a[i])
				System.out.println(i);
		}
	}
}

// 9876 = 9 + 98%10= 8 + 987%10= 7 + 6