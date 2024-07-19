class Solution {
    public String reverseWords(String s) {
        String[] a = s.split("\\s+");
        StringBuilder b = new StringBuilder("");
        for(int i = a.length-1; i >= 0; i--){
            b.append(a[i]);
            b.append(" ");
        }
        return b.toString().trim();
    }
}