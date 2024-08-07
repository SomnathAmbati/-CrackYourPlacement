/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)    return head;
        ListNode lh = null, lt = null, gh = null, gt = null, cur = head;
        while(cur != null){
            if(cur.val < x){
                if(lh == null){
                    lh = lt = cur;
                }
                else{
                    lt.next = cur;
                    lt = lt.next;
                }
            }else{
                if(gh == null){
                    gh = gt = cur;
                }
                else{
                    gt.next = cur;
                    gt = gt.next;
                }
            }
            cur = cur.next;
        }
        if(gt != null)  gt.next = null;
        if(lh == null)  return gh;
        lt.next = gh;
        return lh;
    }
}