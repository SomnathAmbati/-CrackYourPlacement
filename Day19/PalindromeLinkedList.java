class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)   return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode t = rev(slow);
        ListNode cur = head;
        while(cur != null && t != null){
            if(cur.val != t.val){
                return false;
            }
            cur = cur.next;
            t = t.next;
        }
        return true;
    }
    public static ListNode rev(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}