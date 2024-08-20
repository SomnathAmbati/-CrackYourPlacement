class Solution {
    public int[] mostCompetitive(int[] n, int k) {
        // Stack<Integer> st = new Stack<>();
        int []a = new int[k];
        int j = 0;
        for(int i = 0; i < n.length; i++){
            while(j > 0 && a[j-1] > n[i] && n.length - i + j > k){
                j--;
            }

            if(k > j){
                a[j++] = n[i];
            }
        }
       
        // for(int i = k-1; i >= 0; i--){
        //     a[i] = st.pop();
        // }
        return a;
    }
}