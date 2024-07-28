class Tree
{
    public static float findMedian(Node root)
    {
        ArrayList<Integer> l = new ArrayList<>();
        inOrder(root, l);
        int m = l.size()/2;
        if(l.size() % 2 != 0){
            return (float)l.get(m);
        }
        return ((float)l.get(m-1)+(float)l.get(m))/2f;
    }
    public static void inOrder(Node root, ArrayList<Integer> l){
        if(root == null)    return;
        
        inOrder(root.left, l);
        l.add(root.data);
        inOrder(root.right, l);
    }
}