
class Solution {
    public String findOrder(String[] d, int n, int k) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        int[] dis = new int[k];
        for(int i = 0; i < k; i++)  l.add(new ArrayList<>());
        for(int i = 0; i < d.length-1; i++){
            for(int j = 0; j < Math.min(d[i].length(), d[i+1].length()); j++){
                if(d[i].charAt(j) != d[i+1].charAt(j)){
                    l.get(d[i].charAt(j) - 'a').add(d[i+1].charAt(j) - 'a');
                    dis[d[i+1].charAt(j) - 'a']++;
                    break;
                }
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < k; i++){
            if(dis[i] == 0){
                q.add(i);
            }
        }
        
        StringBuilder b = new StringBuilder("");
        while(!q.isEmpty()){
            int cur = q.remove();
            b.append((char) (cur + 'a'));
            for(int i = 0; i < l.get(cur).size(); i++){
                int p = l.get(cur).get(i);
                dis[p]--;
                if(dis[p] == 0) q.add(p);
            }
        }
        
        if(b.length() < k)  return "";
        return b.toString();
    }
}