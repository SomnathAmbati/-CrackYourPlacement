class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        if(n == 0)   return l;
        sol(n, n, l, "");
        return l;
    }
    public static void sol(int o, int c, List<String> l, String s){
        if(o == 0 && c == 0){
            l.add(s);
            return;
        }
        if(o > 0){
            sol(o-1, c, l, s+"(");
        }
        if(o < c){
            sol(o, c-1, l, s+")");
        }
    }
}