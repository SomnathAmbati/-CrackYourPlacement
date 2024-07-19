
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long min = Long.MAX_VALUE;
        int i = 0; 
        int j = m-1;
        while(j < n && i <= n - m){
            min = Math.min(min, Math.abs((long)a.get(j) - a.get(i)));
            j++;
            i++;
        }
        return min;
        
    }
}