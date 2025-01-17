class Solution {
    private int count;

    public int sumK(Node root, int k) {
        count = 0;
        findPaths(root, k, new ArrayList<>());
        return count;
    }

    private void findPaths(Node root, int k, List<Integer> path) {
        if (root == null)
            return;

        path.add(root.data);
        findPaths(root.left, k, path);
        
        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k)
                count++;
        }

        findPaths(root.right, k, path);
        path.remove(path.size() - 1);
    }
}