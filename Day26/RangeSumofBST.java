class Solution {
    public int rangeSumBST(TreeNode root, int l, int h) {
        int[] a = new int[1];
        Inorder(root, l, h, a);
        return a[0];
    }
    public static void Inorder(TreeNode root, int l, int h, int[] a){
        if(root == null)    return;

        Inorder(root.left, l, h, a);
        if(root.val >= l && root.val <= h){
            a[0] += root.val;
        }
        Inorder(root.right, l, h, a);
    }
}