class Solution
{
    static void radixSort(int arr[], int n) 
    { 
        // code here 
        int max = arr[0];
        
        for(int i=1;i<n;i++) {
            max = Math.max(max, arr[i]);
        }
        
        for(int exp=1;max/exp>0;exp=exp*10) {
            countingSort(arr, exp);
        }
    } 
    
    static void countingSort(int[] arr, int exp) {
        int[] count = new int[10];
        
        for(int i=0;i<arr.length;i++) {
            count[(arr[i]/exp)%10]++;
        }
        
        for(int i=1;i<count.length;i++) {
            count[i] = count[i] + count[i-1];
        }
        
        int[] output = new int[arr.length];
        
        for(int i=arr.length-1;i>=0;i--) {
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        
        for(int i=0;i<arr.length;i++) {
            arr[i] = output[i];
        }
    }
}