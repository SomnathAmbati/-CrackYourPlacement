class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        ArrayList<Node> l = new ArrayList<>();
        Inorder(root, l);
        
        pre[0] = null;
        suc[0] = null;
        
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).data < key) {
                pre[0] = l.get(i);
            } else if (l.get(i).data > key) {
                suc[0] = l.get(i);
                break;
            }
        }
    }
    
    public static void Inorder(Node root, ArrayList<Node> l){
        if(root == null)    return;
        
        Inorder(root.left, l);
        l.add(root);
        Inorder(root.right, l);
    }
}