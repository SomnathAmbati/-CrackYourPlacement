class StockSpanner {
    Stack<Pair> st;
    int ind = -1;
    class Pair{
        int p, ind;
        Pair(int p, int ind){
            this.p = p;this.ind = ind;
        }
    }
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int p) {
        ind++;
        while(!st.isEmpty() && p >= st.peek().p){
            st.pop();
        }
        if(st.isEmpty()){
            st.push(new Pair(p, ind));
            return ind+1;
        }
        else{
            int prev = st.peek().ind;
            st.push(new Pair(p, ind));
            return ind - prev;
        }
    }
}
