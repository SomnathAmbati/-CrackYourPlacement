class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']'){
                StringBuilder decodedString = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '['){
                    decodedString.insert(0, st.pop());
                }
                st.pop(); 
                
                StringBuilder numSb = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    numSb.insert(0, st.pop());
                }
                int num = Integer.parseInt(numSb.toString());
                
                String repeat = decodedString.toString();
                for(int j = 0; j < num; j++){
                    for(char c : repeat.toCharArray()){
                        st.push(c);
                    }
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0, st.pop());
        }
        return result.toString();
    }
}