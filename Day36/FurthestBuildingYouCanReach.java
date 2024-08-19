class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < h.length-1; i++){
            if(h[i+1] > h[i]){
                int d = h[i+1] - h[i];
                pq.add(d);
                if(l < pq.size()){
                    b -= pq.remove();
                }
                if(b < 0){
                    return i;
                }
            }
        }
        return h.length-1;
    }
}