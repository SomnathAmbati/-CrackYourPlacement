class Solution {
    private TreeNode prev = null, f = null, m = null, l = null;
    public void recoverTree(TreeNode root) {
        inOrder(root);
        if(l != null){
            int t = f.val;
            f.val = l.val;
            l.val = t;
        }else if(f != null && m != null){
            int t = f.val;
            f.val = m.val;
            m.val = t;
        }
    }
    private void inOrder(TreeNode root){
        if(root == null)    return;

        inOrder(root.left);
        if(prev != null){
            if(prev.val > root.val){
                if(f == null){
                    f = prev;
                    m = root;
                }else{
                    l = root;
                    return;
                }
            }
        }

        prev = root;
        inOrder(root.right);
    }
}