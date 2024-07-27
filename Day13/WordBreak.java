class Solution {
    static class Node {
        Node[] c = new Node[26];
        boolean t;
    }
    
    static Node root;
    
    public static void Insert(String s) {
        Node cur = root;
        for (char ch : s.toCharArray()) {
            int ind = ch - 'a';
            if (cur.c[ind] == null) {
                cur.c[ind] = new Node();
            }
            cur = cur.c[ind];
        }
        cur.t = true;
    }
    
    public static int wordBreak(String s, ArrayList<String> l) {
        root = new Node();
        for (String word : l) {
            Insert(word);
        }
        return wBreak(s) ? 1 : 0;
    }
    
    public static boolean wBreak(String s) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && search(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
    
    public static boolean search(String s) {
        Node cur = root;
        for (char ch : s.toCharArray()) {
            int ind = ch - 'a';
            if (cur.c[ind] == null) {
                return false;
            }
            cur = cur.c[ind];
        }
        return cur.t;
    }
}