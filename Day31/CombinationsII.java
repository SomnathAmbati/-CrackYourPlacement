class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> h = new ArrayList<>();
        sol(h, new ArrayList<>(), c, 0, 0, t);
        return h;
    }
    public static void sol(List<List<Integer>> h, ArrayList<Integer> il, int[] c, int s,  int i, int t){
        if (s == t) {
            h.add(new ArrayList<>(il));
            return;
        }
        if (i == c.length || s > t) {
            return;
        }
        il.add(c[i]);
        sol(h, il, c, s + c[i], i + 1, t);
        il.remove(il.size() - 1);

        while(i+1 < c.length && c[i] == c[i+1]) i++;
        sol(h, il, c, s, i + 1, t);
    }
}