import java.util.*;

class Solution {
    public class Pair {
        TreeNode node; 
        int l;
        Pair(TreeNode node, int l) {
            this.node = node; 
            this.l = l;
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // Step 1: Create a parent map to store parent pointers
        HashMap<TreeNode, TreeNode> np = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        np.put(root, null);

        // Step 2: BFS to build the parent map
        while (!q.isEmpty()) {
            TreeNode r = q.remove();
            if (r.left != null) {
                q.add(r.left);
                np.put(r.left, r);
            }
            if (r.right != null) {
                q.add(r.right);
                np.put(r.right, r);
            }
        }

        // Step 3: BFS to find all nodes at distance K
        List<Integer> result = new ArrayList<>();
        HashSet<TreeNode> vis = new HashSet<>();
        Queue<Pair> q1 = new LinkedList<>();
        q1.add(new Pair(target, 0));
        vis.add(target);

        while (!q1.isEmpty()) {
            Pair r = q1.remove();
            TreeNode currentNode = r.node;
            int currentDistance = r.l;

            if(currentDistance > k){
                break;
            }

            if (currentDistance == k) {
                result.add(currentNode.val);
            }

            if (currentNode.left != null && !vis.contains(currentNode.left)) {
                q1.add(new Pair(currentNode.left, currentDistance + 1));
                vis.add(currentNode.left);
            }

            if (currentNode.right != null && !vis.contains(currentNode.right)) {
                q1.add(new Pair(currentNode.right, currentDistance + 1));
                vis.add(currentNode.right);
            }

            TreeNode parent = np.get(currentNode);
            if (parent != null && !vis.contains(parent)) {
                q1.add(new Pair(parent, currentDistance + 1));
                vis.add(parent);
            }
        }
        return result;
    }
}
