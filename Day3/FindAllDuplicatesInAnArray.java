class Solution {
    public List<Integer> findDuplicates(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        if (a.length <= 1) return l;

        for (int i = 0; i < a.length; i++) {
            while (a[i] != a[a[i] - 1]) {
                int correctIndex = a[i] - 1;
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1) {
                l.add(a[i]);
            }
        }

        return l;
    }
}
