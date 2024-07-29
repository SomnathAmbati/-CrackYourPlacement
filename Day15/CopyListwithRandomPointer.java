
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> h = new HashMap<>();
        Node cur = head; 
        while(cur != null){
            Node copy = new Node(cur.val);
            h.put(cur, copy);
            cur = cur.next;
        }
        cur = head; 
        while(cur != null){
            Node copy = h.get(cur);
            copy.next = h.get(cur.next);
            copy.random = h.get(cur.random);
            cur = cur.next;
        }

        return h.get(head);
    }
}