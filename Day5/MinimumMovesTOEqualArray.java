class Solution {
    public int minMoves2(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int mid = a[n / 2];
        int s = 0;
        for(int i : a){
            if(i != mid){
                s += Math.abs(i - mid);
            }
        }
        return s;
    }
}