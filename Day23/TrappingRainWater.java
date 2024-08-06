class Solution {
    public int trap(int[] arr) {
        int t = 0, c = 0;
        int a[] = new int[arr.length];
        a[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            a[i] = Math.max(a[i-1], arr[i]);
        }
        int b[] = new int[arr.length];
        b[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            b[i] = Math.max(arr[i], b[i+1]);
        }
        for(int i = 0; i < arr.length; i++){
            t = Math.min(a[i], b[i]);
            c += t - arr[i];
        }
        return c;
    }
}