class WordDictionary {

    private WordDictionary[] c;
    private boolean t;

    public WordDictionary() {
        c = new WordDictionary[26];
        t = false;
    }
    public void addWord(String s) {
        WordDictionary cur = this;
        for(int i = 0; i < s.length(); i++){
            int ind = (int)s.charAt(i) - (int) 'a';
            if(cur.c[ind] == null){
                cur.c[ind] = new WordDictionary();
            }
            cur = cur.c[ind];
        }
        cur.t = true;
    }
    
    public boolean search(String s) { 
        return searchHelper(this, s, 0);
    }

    private boolean searchHelper(WordDictionary node, String s, int index) {
        if (index == s.length()) {
            return node.t;
        }
        
        char ch = s.charAt(index);
        if (ch == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.c[i] != null && searchHelper(node.c[i], s, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int ind = ch - 'a';
            if (node.c[ind] == null) {
                return false;
            }
            return searchHelper(node.c[ind], s, index + 1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */