class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        
        Node cur = head;
        
        while (cur != null) {
            if (cur.child != null) {
                Node next = cur.next;
                Node child = flatten(cur.child);
                cur.next = child;
                child.prev = cur;
                
                Node tail = child;
                while (tail.next != null) {
                    tail = tail.next;
                }
                
                // Connect the tail to the next node
                tail.next = next;
                if (next != null) {
                    next.prev = tail;
                }
                
                cur.child = null;
            }
            cur = cur.next;
        }
        
        return head;
    }
}