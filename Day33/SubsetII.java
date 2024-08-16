class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(a); 
        sol(a, 0, l, new ArrayList<>());
        return l;
    }

    public static void sol(int[] a, int i, List<List<Integer>> l, List<Integer> il) {
        if (i == a.length) {
            l.add(new ArrayList<>(il));
            return;
        }

        il.add(a[i]);
        sol(a, i + 1, l, il);

        il.remove(il.size() - 1);
        while (i + 1 < a.length && a[i] == a[i + 1]) i++;
        sol(a, i + 1, l, il);
    }
}
