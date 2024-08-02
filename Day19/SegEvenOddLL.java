class Solution {
    Node divide(Node head) {
        Node eh = null, et = null, oh = null, ot = null;
        Node cur = head;
        while(cur != null){
            if(cur.data % 2 == 0){
                if(eh == null){
                    eh = et = cur;
                }else{
                    et.next = cur;
                    et = et.next;
                }
            }else{
                if(oh == null){
                    oh = ot = cur;
                }else{
                    ot.next = cur;
                    ot = ot.next;
                }
            }
            cur = cur.next;
        }
        ot.next = null;
        if(eh == null)  return oh;
        et.next = oh;
        return eh;
    }
}