class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        if(head == null)    return head;
        if(cur.val == val){
            head = cur.next;
        }
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            else    cur = cur.next;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        return head;
    }
}