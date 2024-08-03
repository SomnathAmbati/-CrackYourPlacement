class Solution {
    public ListNode addTwoNumbers(ListNode l1h, ListNode l2h) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        while(l1h != null || l2h != null || carry != 0){
            int s = ((l1h != null)? l1h.val:0) + ((l2h != null)? l2h.val:0) + carry;
            ans.next = new ListNode(s % 10);
            ans = ans.next;
            carry = s / 10;
            l1h = (l1h != null) ? l1h.next : null;
            l2h = (l2h != null) ? l2h.next : null;
        }
        return dummy.next;
    }
}