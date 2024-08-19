class GfG
{
    int maxLen(int a[], int n)
    {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, -1);
        int ans = 0;
        int s = 0;
        for(int i = 0; i < n; i++){
            s += a[i];
            if(h.containsKey(s)){
                ans = Math.max(i - h.get(s), ans);
            }
            else{
                h.put(s, i);
            }
        }
        return ans;
    }
}