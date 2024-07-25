import java.util.*;
public class CeilFloorArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 7, 9};
        int x = 3;
        int m = Integer.MAX_VALUE;
        int c = 0;
        for(int i : a){
            if(x > i)   continue;
            else{
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
