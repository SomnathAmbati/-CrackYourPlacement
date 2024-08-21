class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, list, 0);
        return list;
    }
    public void rightView(TreeNode node, List<Integer> list, int level){
        if(node == null) return;
        if(level == list.size()){
            list.add(node.val);
        }
        rightView(node.right, list, level + 1);
        rightView(node.left, list, level + 1);
    }
}