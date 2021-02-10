package Back_June.Level6___함수;

public class June_601 {	// 15596
	long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
        	ans += a[i];
        }
        return ans;
    }
}