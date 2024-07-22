class Solution {
    public int subarraysDivByK(int[] a, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        int s = 0;
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            s = (s + a[i])%k;
            if(s < 0)   s += k;
            if(h.containsKey(s)){
                ans += h.get(s);
            }
            h.put(s, h.getOrDefault(s, 0) + 1);
        }
        return ans;
    }
}