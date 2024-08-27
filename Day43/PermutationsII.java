
class Solution {
    public List<List<Integer>> permuteUnique(int[] a) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(a); 
        sol(a, l, 0);
        return l;
    }

    private void sol(int[] a, List<List<Integer>> l, int i) {
        if (i == a.length) {
            List<Integer> il = new ArrayList<>();
            for (int num : a) il.add(num);
            l.add(il);
            return;
        }
        Set<Integer> seen = new HashSet<>();  
        for (int j = i; j < a.length; j++) {
            if (seen.contains(a[j])) continue;  
            seen.add(a[j]);
            swap(a, i, j);
            sol(a, l, i + 1);
            swap(a, i, j); 
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
