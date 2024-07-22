import java.util.*;
public class PrintDupChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> h = new HashMap<>();
        String s = "levelinglevels";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }
        for(char i : h.keySet()){
            if(h.get(i) > 1){
                System.out.print(i + " -> " + h.get(i) + "\n");
            }
        }
    }
}
