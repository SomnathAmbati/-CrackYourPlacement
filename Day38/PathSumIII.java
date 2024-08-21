
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        
        int pathsFromRoot = countPaths(root, targetSum);
        
        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);
        
        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }

    private int countPaths(TreeNode node, long targetSum) {
        if (node == null) return 0;
        
        int count = 0;
        if (node.val == targetSum) {
            count++;
        }
        
        count += countPaths(node.left, targetSum - node.val);
        count += countPaths(node.right, targetSum - node.val);
        
        return count;
    }
}
