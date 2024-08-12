class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        
        if (root == null) {
            return paths; 
        }

        constructPaths(root, "", paths);
        return paths;
    }

    private void constructPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) {
            return; 
        }

        path += node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            path += "->";
            constructPaths(node.left, path, paths);
            constructPaths(node.right, path, paths);
        }
    }
}
