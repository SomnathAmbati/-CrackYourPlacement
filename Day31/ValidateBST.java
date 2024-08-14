class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null)    return true;
        return check(root, null, null);
    }
    public static boolean check(TreeNode root, TreeNode min, TreeNode max){
        if(root == null)    return true;
        if(min != null && min.val <= root.val)  return false;
        if(max != null && max.val >= root.val) return false;

        return check(root.left, root, max) && check(root.right, min, root);
    }
}