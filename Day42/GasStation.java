class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int b = 0;
        int p = 0;
        int ind = 0;
        for(int i = 0; i < g.length; i++){
           b += g[i] - c[i];
           p += g[i] - c[i];

           if(b < 0){
            b = 0;
            ind = i+1;
           }
        }
        return p >= 0? ind : -1;
    }
}