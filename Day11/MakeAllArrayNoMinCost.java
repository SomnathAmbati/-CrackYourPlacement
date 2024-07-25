import java.util.* ;
import java.io.*; 

public class Solution {

	public static int findMinimumCost(int[] a, int n) {
		// Write your code here
		Arrays.sort(a);
		int m = a[a.length/2];
		int ans = 0;
		for(int i : a){
			ans += Math.abs(m - i);
		}
		return ans;
	}
}
