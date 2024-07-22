class Solution {
    public int maxProfit(int[] p) {
        int min = p[0];
        int s = 0;
        for(int i = 1; i < p.length; i++){
            if(min >= p[i]){
                min = p[i];
            }else{
                s += p[i] - min; 
                min = p[i]; 
            }
        }
        return s;
    }
}