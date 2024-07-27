class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int a[])
    {
        int[] b = new int[a.length];
        int k = 0;
        for(int i : a){
            b[k++] = i;
        }
        Arrays.sort(b);
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < b.length; i++){
            h.put(b[i], i);
        }
        int c = 0;
        for(int i = 0; i < a.length; i++){
            while(h.get(a[i]) != i){
                swap(a, i, h.get(a[i]));
                c++;
            }
        }
        return c;
    }
    public static void swap(int a[], int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}