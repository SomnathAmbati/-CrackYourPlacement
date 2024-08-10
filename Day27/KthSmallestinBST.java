class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        Inorder(root, l);
        return l.get(k-1);
    }
    public static void Inorder(TreeNode root, ArrayList<Integer> l){
        if(root == null)    return;

        Inorder(root.left, l);
        l.add(root.val);
        Inorder(root.right, l);
    }
}