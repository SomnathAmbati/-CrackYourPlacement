class Solution {
    public ListNode sortList(ListNode head) {
        ListNode cur = head;
        ArrayList<Integer> l = new ArrayList<>();
        while(cur != null){
            l.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(l);
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;

        for(int i : l){
            res.next = new ListNode(i);
            res = res.next; 
        }

        return dummy.next;
    }
}