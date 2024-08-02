class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 0 || head == null)   return head;
        ListNode cur = head;
        int c = 0;
        while(c < k && cur != null){
            c++;
            cur = cur.next;
        }
        if (c == k) {
            cur = head;
            ListNode prev = null;
            ListNode next = null;
            
            for (int i = 0; i < k; i++) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            return prev;
        } else {
            return head;
        }
    }
}