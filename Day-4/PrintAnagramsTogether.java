
class Solution {
    public List<List<String>> Anagrams(String[] s) {
        Map<String, List<String>> h = new HashMap<>();
        
        for(int i = 0; i < s.length; i++){
            char[] a = s[i].toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            if(!h.containsKey(b)){
                h.put(b, new ArrayList<>());
            }
            h.get(b).add(s[i]);
        }
        return new ArrayList<>(h.values());
    }
}