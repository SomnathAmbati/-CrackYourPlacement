
class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] a, int m) {
        if(m > n)  return (long)-1;
        long h = 0;
        long l = 0;
        for(int i = 0; i < a.length; i++){
            l = Math.max(l, a[i]);
            h += a[i];
        }
        while(l <= h){
            long mid = l + (h-l)/2;
            int stu = Sol(a, mid);
            if(stu > m) l = mid + 1;
            else{
                h = mid-1;
            }
        }
        return l;
    }
    public static int Sol(int[] a, long mid) {
        long s = 0;
        int stu = 1;
        for (int i = 0; i < a.length; i++) {
            if (s + a[i] > mid) {
                stu++;
                s = a[i];
            } else {
                s += a[i];
            }
        }
        return stu;
    }
}