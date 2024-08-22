class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();
        if(root == null)    return l;
        List<Integer> t = new ArrayList<>();
        t.add(root.val);
        l.add(t);
        q.add(root);
        int c = 1;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> il = new ArrayList<>();
            for(int i = 0; i < s; i++){
                    TreeNode r = q.remove();
                    if(r.left != null){
                        q.add(r.left);
                        il.add(r.left.val);
                    }
                    if(r.right != null){
                        q.add(r.right);
                        il.add(r.right.val);
                    }
            }
            if(il.size() > 0){
                if(c % 2 == 0){
                    l.add(new ArrayList<>(il));
                }else{
                    Collections.reverse(il);
                    l.add(new ArrayList<>(il));
                }
            }
            c++;
        }
        return l;
    }
}