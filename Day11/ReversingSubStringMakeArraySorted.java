import java.util.*;

public class ReversingSubStringMakeArraySorted {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 5, 4, 7, 8};
        ArrayList<Integer> l = new ArrayList<>();
        int s = -1;
        int e = -1;
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                s = i-1;
                break;
            }
        }
        if(s != -1){
            for(int i = s+1 ; i < a.length; i++){
                if(a[i] > a[i-1]){
                    e = i-1;
                    break;
                }
            }
        }
        for(int i = s; i <= e; i++){
            l.add(a[i]);
        }
        Collections.sort(l);
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(i >= s && i <= e){
                a[i] = l.get(k++);
            }
        }
        System.out.println(Arrays.toString(a));
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
