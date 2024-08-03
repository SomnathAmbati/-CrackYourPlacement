class Solution
{
    Node compute(Node head)
    {
        Node cur = rev(head);
        Node dummy = new Node(0);
        Node ans = dummy;
        while(cur != null){
            if(cur.data >= ans.data){
                ans.next = new Node(cur.data);
                ans = ans.next;
            }
            cur = cur.next;
        }
        return rev(dummy.next);
    }
    public static Node rev(Node head){
        Node prev = null;
        Node next, cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}