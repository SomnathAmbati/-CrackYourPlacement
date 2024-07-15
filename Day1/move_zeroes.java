class Solution {
    public void moveZeroes(int[] a) {
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                a[k++] = a[i];
            }
        }
        for(int i = k; i < a.length; i++){
            a[i] = 0;
        }
    }
}