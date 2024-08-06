class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int m[][]) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < m.length; i++){
            s.push(i);
        }
        while(s.size() > 1){
            int a = s.pop();
            int b = s.pop();
            if(m[a][b] == 1){
                s.push(b);
            }
            else{
                s.push(a);
            }
        }
        int c = s.pop();
        boolean t = true;
        for(int i = 0; i < m.length; i++){
            if(c != i && (m[i][c] == 0 || m[c][i] == 1)){
                t = false;
                break;
            }
        }
        if(!t){
            return -1;
        }
        return c;
    }
}