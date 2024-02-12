package ProgramTasks;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {
    public static void main(String[] args) {
        String st = "mumbai";
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        char[] strAry = st.toCharArray();

        for (char ch : strAry) {
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }
        }
        for (Map.Entry entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
