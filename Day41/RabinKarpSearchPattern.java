class Solution
{
    ArrayList<Integer> search(String p, String t)
    {
        ArrayList<Integer> l = new ArrayList<>();
        int index = 0;
        
        while ((index = t.indexOf(p, index)) != -1) {
            l.add(index + 1);
            index++;
        }
        
        return l;
    }
}