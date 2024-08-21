class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> l = new ArrayList<>();
        sol(c, t, 0, l, new ArrayList<>());
        return l;
    }
    public static void sol(int[] c, int t, int i, List<List<Integer>> l, List<Integer> il){
        if(t == 0){
            l.add(new ArrayList<>(il));
            return;
        }
        if(i == c.length){
            return;
        }
        if(t < 0)   return;

        il.add(c[i]);
        sol(c, t - c[i], i, l, il);
        il.remove(il.size()-1);

        sol(c, t, i+1, l, il);
    }
}