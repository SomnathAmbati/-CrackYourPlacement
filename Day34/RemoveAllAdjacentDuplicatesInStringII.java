class Solution {
    public class Pair{
        char c;
        int d;
        Pair(char c, int d){
            this.c = c; this.d = d;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek().c == c && st.peek().d == k-1){
                while(!st.isEmpty() && c == st.peek().c){
                    st.pop();
                }
            }else if(!st.isEmpty() && st.peek().c == c){
                int c1 = st.peek().d;
                st.push(new Pair(c, c1+1));
            }    
            else{
                st.push(new Pair(c, 1));
            }
        }
        StringBuilder b = new StringBuilder("");
        while(!st.isEmpty()){
            b.append(st.pop().c);
        }
        return b.reverse().toString();
    }
}