
class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++){
            if(a[i] + b[n-i-1] < k){
                return false;
            }
        }
        return true;
    }
}