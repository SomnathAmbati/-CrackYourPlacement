class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> l = new ArrayList<>();
        sol(a, 0, l, new ArrayList<>());
        return l;
    }
    public static void sol(int[] a, int i, List<List<Integer>> l, List<Integer> il){
        if(i == a.length){
            l.add(new ArrayList<>(il));
            return;
        }
        il.add(a[i]);
        sol(a, i+1, l, il);
        il.remove(il.size()-1);
        sol(a, i+1, l, il);
    }
}