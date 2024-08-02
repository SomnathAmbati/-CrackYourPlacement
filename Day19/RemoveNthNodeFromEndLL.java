class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        if(n == size)   return head.next;
        int ind = size - n - 1;
        cur = head;
        for(int i = 0; i < ind; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}