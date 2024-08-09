class Solution
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        int c[] = new int[1];
        count(root, l, h, c);
        return c[0];
    }
    public static void count(Node root, int l, int h, int[] c){
        if(root == null)    return;
        if(root.data >= l && root.data <= h){
            c[0]++;
            count(root.left, l, h, c);
            count(root.right, l, h, c);
        }else if(root.data < l){
            count(root.right, l, h, c);
        }else{
            count(root.left, l, h, c);
        }
    }
}
