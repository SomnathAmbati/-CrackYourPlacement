class Solution {
    public TreeNode sortedArrayToBST(int[] n) {
        return sol(n, 0, n.length-1);
    }
    public static TreeNode sol(int[] a, int s, int e){
        if(s > e)   return null;
            
        int mid = (s + e)/2;    
        TreeNode root = new TreeNode(a[mid]);
        root.left = sol(a, s, mid-1);
        root.right = sol(a, mid+1, e);
        return root;
    }
}