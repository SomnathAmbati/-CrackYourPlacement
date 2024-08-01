class Solution {
    public long multiplyTwoLists(Node f, Node s) {
        long MOD = 1000000007;
        long num1 = 0, num2 = 0;
        
        Node cur = f;
        while(cur != null) {
            num1 = (num1 * 10 + cur.data) % MOD;
            cur = cur.next;
        }
        
        cur = s;
        while(cur != null) {
            num2 = (num2 * 10 + cur.data) % MOD;
            cur = cur.next;
        }
        
        return (num1 * num2) % MOD;
    }
}