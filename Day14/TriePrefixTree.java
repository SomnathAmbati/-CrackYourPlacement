class Trie {
    Trie[] c;
    boolean t;
    public Trie() {
        c = new Trie[26];
        t = false;
    }
    
    public void insert(String s) {
        Trie cur = this;
        for(int i = 0; i < s.length(); i++){
            int ind = s.charAt(i) - 'a';
            if(cur.c[ind] == null){
                cur.c[ind] = new Trie();
            }
            cur = cur.c[ind];
        }
        cur.t = true;
    }
    
    public boolean search(String s) {
        Trie cur = this;
        for(int i = 0; i < s.length(); i++){
            int ind = s.charAt(i) - 'a';
            if(cur.c[ind] == null){
                return false;
            }
            cur = cur.c[ind];
        }
        return cur.t;
    }
    
    public boolean startsWith(String p) {
        Trie cur = this;
        for(int i = 0; i < p.length(); i++){
            int ind = p.charAt(i) - 'a';
            if(cur.c[ind] == null){
                return false;
            }
            cur = cur.c[ind];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */