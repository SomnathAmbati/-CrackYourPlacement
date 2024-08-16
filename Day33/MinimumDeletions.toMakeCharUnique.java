class Solution {
    public int minDeletions(String s) {
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) - 'a';
            a[c]++;
        }
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < 26; i++){
            if(a[i] > 0){
                if(!h.contains(a[i])){
                    h.add(a[i]);
                }else{
                    l.add(a[i]);
                }
            }
        }
        int s1 = 0;
        for(int i : l){
            s1 += i;
        }
        int s2 = 0;
        for(int i = 0; i < l.size(); i++){
            if(l.get(i) > 0){
                int c = l.get(i);
                while(c != 0 && h.contains(c)){
                    c--;
                }
                l.set(i, c);
                s2 += c;
                h.add(c);
            }
        }
        return s1 - s2;
    }
}