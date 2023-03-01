import java.util.HashMap;
import java.util.Map;

public class practice13 {
    public static void main(String[] args) {
        String word = "Hello java";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
}
}
