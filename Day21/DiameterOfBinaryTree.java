class Solution {
    int maxD=0; 
    public int diameterOfBinaryTree(TreeNode root) {
       checkBal(root);
       return(maxD);
   }
   public int checkBal(TreeNode root)
   {   
       if(root==null)
           return 0;    
       int leftl=checkBal(root.left);
       int rightl=checkBal(root.right);
       maxD=Math.max(maxD,rightl+leftl); 
       return (Math.max(leftl,rightl)+1);   
   }
}
