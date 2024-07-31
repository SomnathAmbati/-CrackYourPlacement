class Solution {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if (head == null || l == r) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode res = dummy;
        for(int i = 0; i < l-1; i++){
            res = res.next;
        }

        ListNode cur = res.next;
        for(int i = 0; i < r-l; i++){
            ListNode t = cur.next;
            cur.next = t.next;
            t.next = res.next;
            res.next = t;
        }

        return dummy.next;
    }
}