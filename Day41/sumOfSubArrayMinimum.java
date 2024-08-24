class Solution {
    public int sumSubarrayMins(int[] a) {
        int mod = (int) 1e9 + 7;
        Stack<Integer> st = new Stack<>();
        int[] l = new int[a.length];
        Arrays.fill(l, -1);
        int[] r = new int[a.length];
        Arrays.fill(r, a.length);
        for(int i = 0; i < a.length; i++){
            while(!st.isEmpty() && a[st.peek()] >= a[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                l[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = a.length-1; i >= 0; i--){
            while(!st.isEmpty() && a[st.peek()] > a[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                r[i] = st.peek();
            }
            st.push(i);
        }
        long ans = 0;
        for(int i = 0; i < a.length; i++){
            long left = i - l[i];
            long right = r[i] - i;
            ans = (ans + (left * right % mod) * a[i] % mod) % mod;
        }
        return (int) ans;
    }
}