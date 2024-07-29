class Solution {
    public Node subLinkedList(Node head1, Node head2) {
        Node cur = head1;
        StringBuilder b1 = new StringBuilder();
        while (cur != null) {
            b1.append(cur.data);
            cur = cur.next;
        }
        
        cur = head2;
        StringBuilder b2 = new StringBuilder();
        while (cur != null) {
            b2.append(cur.data);
            cur = cur.next;
        }

        BigInteger a1 = new BigInteger(b1.toString());
        BigInteger a2 = new BigInteger(b2.toString());

        BigInteger result = a1.subtract(a2).abs();
        String resultStr = result.toString();
        
        Node dummy = new Node(-1);
        Node res = dummy;
        for (int i = 0; i < resultStr.length(); i++) {
            int t = Character.getNumericValue(resultStr.charAt(i));
            res.next = new Node(t);
            res = res.next;
        }
        return dummy.next;
    }
}