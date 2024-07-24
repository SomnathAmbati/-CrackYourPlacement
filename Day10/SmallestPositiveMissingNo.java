class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int a[], int n)
    {
        HashSet<Integer> h = new HashSet<>();
        for(int i : a){
            if(i > 0)   h.add(i);
        }
        int m = 1;
        int i = 0;

        while(i <= n){
            if(!h.contains(m)){
                break;
            }
            m++;i++;
        }
        return m;
    }
}
