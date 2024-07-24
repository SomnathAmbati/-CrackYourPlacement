class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : arr)    h.put(i, h.getOrDefault(i, 0) + 1);
        for(int i = 0; i < arr.length; i++){
            if(x == 0 && h.get(arr[i]) > 1) return 1;
            if(x > 0 && h.containsKey(x + arr[i])){
                return 1;
            }
        }
        return -1;
    }
}
