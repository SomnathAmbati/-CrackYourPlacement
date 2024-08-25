class Solution {
    public class Pair implements Comparable<Pair>{
        char c; int f;
        Pair(char c, int f){
            this.c = c;
            this.f = f;
        }
        public int compareTo(Pair p2){
            return p2.f - this.f;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        char[] a = new char[s.length()];
        for(char c : h.keySet()){
            pq.add(new Pair(c, h.get(c)));
        }

        int i = 0;
        while(!pq.isEmpty()){
            Pair r = pq.remove();
            int f = r.f;
            char c = r.c;
            while(f > 0){
                if(a[i] == '\0'){
                    a[i] = c;
                    f--;
                    i = (i + 2) % s.length();
                }else{
                    i = (i+1) % s.length();
                }
            }
        }

        for(int j = 1; j < a.length; j++){
            if(a[j] == a[j-1]){
                return "";
            }
        }
        return new String(a);
    }
}