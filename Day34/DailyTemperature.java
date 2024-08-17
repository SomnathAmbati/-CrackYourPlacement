class Solution {
    public int[] dailyTemperatures(int[] a) {
        int[] r = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < a.length; i++){
            while(!st.isEmpty() && a[i] > a[st.peek()]){
                int ind = st.pop();
                r[ind] = i - ind;
            }
            st.push(i);
        }
        return r;
    }
}