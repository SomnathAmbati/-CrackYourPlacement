class Solution {
    public int leastInterval(char[] t, int n) {
        int[] a = new int[26];
        for(char c : t){
            a[c - 'A']++;
        }
        Arrays.sort(a);
        int m = a[25]-1;
        int s = m * n;
        for(int i = 24; i >= 0 && a[i] > 0; i--){
            s -= Math.min(m, a[i]);
        }
        return s > 0? t.length+s : t.length;
    }
}