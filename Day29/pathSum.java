class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return isSum(root, targetSum);
    }
    
    private boolean isSum(TreeNode root, int remainingSum) {
        if (root == null) return false;
        remainingSum -= root.val;
        if (root.left == null && root.right == null) {
            return remainingSum == 0;
        }
        return isSum(root.left, remainingSum) || isSum(root.right, remainingSum);
    }
}