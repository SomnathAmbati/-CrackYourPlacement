class Solution {

    // Should rearrange given linked list such that all even
    // positioned Nodes are before odd positioned.
    // Returns nothing
    void rearrangeEvenOdd(Node head) {
        Node oh = null, ot = null;
        Node eh = null, et = null;
        int c = 0;
        Node cur = head;
        while(cur != null){
            if(c % 2 == 0){
                if(oh == null){
                    oh = ot = cur;
                }else{
                    ot.next = cur;
                    ot = ot.next;
                }
            }else{
                if(eh == null){
                    eh = et = cur;
                }else{
                    et.next = cur;
                    et = et.next;
                }
            }
            cur = cur.next;
            c++;
        }
        if(et != null)  et.next = null;
        if(eh != null)  ot.next = eh;
    }
}