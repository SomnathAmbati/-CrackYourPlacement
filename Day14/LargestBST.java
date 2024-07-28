class Solution {
    public static class Info {
        boolean t;
        int max, min, s;
        public Info(boolean t, int max, int min, int s) {
            this.t = t; this.max = max; this.min = min; this.s = s;
        }
    }

    public static int maxBst = 0;

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        maxBst = 0; // Reset maxBst for each call
        Lbst(root);
        return maxBst;
    }

    public static Info Lbst(Node root) {
        if (root == null) return new Info(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);

        Info l = Lbst(root.left);
        Info r = Lbst(root.right);

        int max = Math.max(root.data, Math.max(l.max, r.max));
        int min = Math.min(root.data, Math.min(l.min, r.min));
        int s = l.s + r.s + 1;

        if (l.t && r.t && root.data > l.max && root.data < r.min) {
            maxBst = Math.max(maxBst, s);
            return new Info(true, max, min, s);
        } else {
            return new Info(false, max, min, s);
        }
    }
}