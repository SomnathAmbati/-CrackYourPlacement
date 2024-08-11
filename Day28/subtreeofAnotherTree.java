class Solution {
    public boolean isSubtree(TreeNode root, TreeNode sR) {
        if(root == null)    return false;
        if(root.val == sR.val && isSame(root, sR)){
            return true;
        }
        return isSubtree(root.left, sR) || isSubtree(root.right, sR);
    }
    public static boolean isSame(TreeNode root, TreeNode sR){
        if(root == null && sR == null)  return true;
        if(root == null || sR == null || root.val != sR.val)  return false;
        
        return isSame(root.left, sR.left) && isSame(root.right, sR.right);
    }
}