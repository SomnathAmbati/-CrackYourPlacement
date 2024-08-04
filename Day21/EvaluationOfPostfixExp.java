class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                st.push(s.charAt(i) - '0');
            }else{
                int a = st.pop();
                int b = st.pop();
                if(s.charAt(i) == '*'){
                    st.push(a * b);
                }else if(s.charAt(i) == '/'){
                    st.push(b / a);
                }else if(s.charAt(i) == '-'){
                    st.push(b - a);
                }else{
                    st.push(a + b);
                }
            }
        }
        return st.pop();
    }
}