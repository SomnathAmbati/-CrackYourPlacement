
class Solution {
    
    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> a , int n) {
        LinkedHashSet<ArrayList<Integer>> l = new LinkedHashSet<>();
        Collections.sort(a);
        permutate(a, 0, l);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.addAll(l);
        Collections.sort(al, (o1, o2) -> {
            for (int i = 0; i < o1.size(); i++) {
                if (!o1.get(i).equals(o2.get(i))) {
                    return o1.get(i) - o2.get(i);
                }
            }
            return 0;
        });
        return al;
    }
    private static void permutate(ArrayList<Integer> a, int index, LinkedHashSet<ArrayList<Integer>> l){
        if(index == a.size()-1){
            l.add(new ArrayList<>(a));
            return;
        }
        
        for(int i = index; i < a.size(); i++){
            swap(a, i, index);
            
            permutate(a, index+1, l);
            
            swap(a, index, i);
        }
    }
    private static void swap(ArrayList<Integer> a, int i, int j){
        int t = a.get(i);
        a.set(i, a.get(j));
        a.set(j, t);
    }
};