class Solution {
    static ArrayList<ArrayList<String>> displayContacts(int n, String c[], String s) {
        ArrayList<ArrayList<String>> ol = new ArrayList<>();
        StringBuilder t = new StringBuilder("");
        
        Arrays.sort(c);
        
        for(int i = 0; i < s.length(); i++) {
            t.append(s.charAt(i));
            ArrayList<String> il = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if(c[j].startsWith(t.toString())) {
                    if(!il.contains(c[j])) {
                        il.add(c[j]);
                    }
                }
            }
            if(il.isEmpty()) {
                il.add("0");
            }
            ol.add(il);
        }
        return ol;
    }
}