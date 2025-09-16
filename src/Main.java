import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        String s="abcdetw";
        String[] words={"a", "abc", "ace", "ade", "hge", "ure"};
        Map<Character, ArrayList<StringBuilder>> map= new HashMap<>();
        for(String str: words){
            char firstChar = str.charAt(0);
            map.computeIfAbsent(firstChar, k->new ArrayList<>()).add(new StringBuilder(str));
        }
        System.out.print(map);
    }
}