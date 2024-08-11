class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)    return null;

        TreeNode rs = invertTree(root.right);
        TreeNode l = invertTree(root.left);

        root.left = rs;
        root.right = l;
        
        return root;
    }
}