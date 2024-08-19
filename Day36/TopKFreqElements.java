class Solution {
    public static class Pair implements Comparable<Pair>{
        int k, v;
        Pair(int k, int v){
            this.k = k; this.v = v;
        }

        public int compareTo(Pair p2){
            return p2.v - this.v;
        }
    }
    public int[] topKFrequent(int[] n, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : n){
            h.put(i , h.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i : h.keySet()){
            pq.add(new Pair(i, h.get(i)));
        }
        int[] a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = pq.remove().k;
        }
        return a;
    }
}