class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder b = new StringBuilder("");
        ListNode cur = head;
        while(cur != null){
            b.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(b.toString(), 2);
    }
}