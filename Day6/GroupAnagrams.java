class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String ,List<String>> h = new HashMap<>();
        for(int i = 0; i < s.length; i++){
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String t = new String(c);
            if(!h.containsKey(t)){
                h.put(t, new ArrayList<>());
            }
            h.get(t).add(s[i]);
        }
        return new ArrayList<>(h.values());
    }
}