class GfG {
    int findDist(Node root, int a, int b) {
        Node Lca = lca(root, a, b);
        int d1 = getDist(Lca, a);
        int d2 = getDist(Lca, b);
        return d1 + d2;
    }
    public static int getDist(Node root, int n){
        if(root == null)    return -1;
        if(root.data == n)  return 0;
        int ld = getDist(root.left, n);
        int rd = getDist(root.right, n);
        if(ld == -1 && rd == -1){
            return -1;
        }else if(ld == -1){
            return rd + 1;
        }else{
            return ld + 1;
        }
    }
    public static Node lca(Node root, int a, int b){
        if(root == null || root.data == a || root.data == b)    return root;
        
        Node l = lca(root.left, a, b);
        Node r = lca(root.right, a, b);
        
        if(l == null)   return r;
        if(r == null)  return l;
        
        return root;
    }
}