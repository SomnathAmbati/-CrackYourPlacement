class Solution {
    Node constructTree(int n, int pre[], char preLN[]) {
        if (n == 0) return null;
        int[] index = {0}; 
        return Construct(n, pre, preLN, index);
    }

    public static Node Construct(int n, int pre[], char[] preLN, int[] index) {
        int i = index[0];

        if (i == n) return null;

        Node root = new Node(pre[i]);

        index[0]++; 

        if (preLN[i] == 'N') {
            root.left = Construct(n, pre, preLN, index);
            root.right = Construct(n, pre, preLN, index);
        }

        return root;
    }
}