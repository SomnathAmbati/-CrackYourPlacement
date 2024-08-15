class Solution {
    Node zigZag(Node head) {
        // add code here.
        boolean t = false;
        Node cur = head;
        while(cur.next != null){
            if(!t){
                if(cur.data > cur.next.data){
                    int temp = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                }
                t = true;
            }else{
                if(cur.data < cur.next.data){
                    int temp = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = temp;
                }
                t = false;
            }
            cur = cur.next;
        }
        
        return head;
    }
}