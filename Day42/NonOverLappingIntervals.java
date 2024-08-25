class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
        int c = 0;
        int m = a[0][1];
        for(int i = 1; i < a.length; i++){
            if(a[i][0] < m){
                c++;
            }else{
                m = a[i][1];
            }
        }
        return c;
    }
}