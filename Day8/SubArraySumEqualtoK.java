class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        int s = 0;
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            s += a[i];
            if(h.containsKey(s - k)){
                ans += h.get(s - k);
            }
            h.put(s, h.getOrDefault(s, 0) + 1);
        }
        return ans;
    }
}
