class Solution {
    private ArrayList<Integer> l = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return l;
    }
    private void traverse(TreeNode root){
        if(root == null)    return;
        traverse(root.left);
        l.add(root.val);
        traverse(root.right);
    }
}