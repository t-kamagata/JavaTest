package jp.co.aforce.test;

public class MinMax {
	public int getMaxValue(int a, int b, int c) {
		int ans = a;
		if(b > ans)
			ans = b;
		if(c > ans)
			ans = c;
		return ans;
	}
	
	public int getMinValue(int a, int b, int c) {
		int ans = a;
		if(b < ans)
			ans = b;
		if(c < ans)
			ans = c;
		return ans;
	}
}
