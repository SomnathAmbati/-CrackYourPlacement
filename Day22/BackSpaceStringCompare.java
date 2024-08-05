class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!s1.isEmpty() && c == '#'){
                s1.pop();
            }else if(c != '#'){
                s1.push(c);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!s2.isEmpty() && c == '#'){
                s2.pop();
            }else if(c != '#'){
                s2.push(c);
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop() != s2.pop()){
                return false;
            }
        }
        if(s1.size() != s2.size())  return false;
        return true;
    }
}