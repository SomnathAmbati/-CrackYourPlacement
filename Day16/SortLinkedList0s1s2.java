class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        int c0 = 0, c1 = 0, c2 = 0;
        Node cur = head;
        while(cur != null){
            if(cur.data == 0){
                c0++;
            }
            else if(cur.data == 1)  c1++;
            else    c2++;
            cur = cur.next;
        }
        Node dummy = new Node(-1);
        Node res = dummy;
        while(c0 > 0){
            res.next = new Node(0);
            res = res.next;
            c0--;
        }
        while(c1 > 0){
            res.next = new Node(1);
            res = res.next;
            c1--;
        }
        while(c2 > 0){
            res.next = new Node(2);
            res = res.next;
            c2--;
        }
        return dummy.next;
    }
}