class Solution {
    public TreeNode mergeTrees(TreeNode r1, final TreeNode r2) {
        if (r1 == null && r2 == null) return null;
        else if (r1 == null) return r2;
        else if (r2 == null) return r1;
        else {
            r1.val += r2.val;
            r1.left = mergeTrees(r1.left, r2.left);
            r1.right = mergeTrees(r1.right, r2.right);
            return r1;
        }
    }
}