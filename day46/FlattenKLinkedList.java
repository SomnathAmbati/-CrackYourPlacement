class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        ArrayList<Integer> l = new ArrayList<>();
        Node cur = root;
        while(cur != null){
            Node t = cur.bottom == null? null : cur.bottom;
            while(t != null){
                l.add(t.data);
                t = t.bottom;
            }
            l.add(cur.data);
            cur = cur.next;
        }
        Collections.sort(l);
        Node dummy = new Node(0);
        Node res = dummy;
        for(int i : l){
            res.bottom = new Node(i);
            res = res.bottom;
        }
        return dummy.bottom;
    }
}