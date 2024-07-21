class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String p = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            while (index < p.length() && index < strs[i].length() && p.charAt(index) == strs[i].charAt(index)) {
                index++;
            }
            p = p.substring(0, index);
        }
        return p;
    }
}