class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        lvlOrdr(root, result, 0);
        return result;
    }

    public void lvlOrdr(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) return;
        if (result.size() == level) result.add(new ArrayList<>());
        result.get(level).add(root.val);
        lvlOrdr(root.left, result, level + 1);
        lvlOrdr(root.right, result, level + 1);
    }
}