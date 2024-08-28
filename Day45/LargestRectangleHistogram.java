class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> s = new Stack<>();
        int[] nsl = new int[h.length];
        int[] nsr = new int[h.length];
        for(int i = 0; i < h.length; i++){
            while(!s.isEmpty() && h[s.peek()] >= h[i]){
                s.pop();
            }
            if(s.isEmpty()) nsl[i] = -1;
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i = h.length - 1; i >= 0; i--){
            while(!s.isEmpty() && h[s.peek()] >= h[i]){
                s.pop();
            }
            if(s.isEmpty()) nsr[i] = h.length;
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        int max = 0;
        for(int i = 0; i < h.length; i++){
            max = Math.max(max, (nsr[i]-nsl[i]-1) * h[i]);
        }
        return max;
    }
}