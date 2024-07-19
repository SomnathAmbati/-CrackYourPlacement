
class Solution 
{ 
	public static long[] productExceptSelf(int b[], int n) 
	{ 
        long[] a = new long[b.length];
        long p = 1;
        long s = 1;
        long[] pr = new long[a.length];
        long[] su = new long[a.length];
        for(int i = 0; i < n; i++){
            pr[i] = p;
            p *= (long)b[i];
        }
        for(int i = n-1; i >= 0; i--){
            su[i] = s;
            s *= (long) b[i];
        }
        for(int i = 0; i < n; i++){
            a[i] = pr[i] * su[i];
        }
        return a;
	} 
} 
