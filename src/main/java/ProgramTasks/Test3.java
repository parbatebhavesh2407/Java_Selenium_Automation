package ProgramTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        String p = "mumbaimumbai";
        char[] ch = p.toCharArray();
        HashMap<Character, Integer> hashm = new HashMap<Character, Integer>();

        for (char k : ch) {
            if (hashm.containsKey(k)) {
                hashm.put(k, hashm.get(k) + 1);
            } else {
                hashm.put(k, 1);
            }
        }
        for (Map.Entry k : hashm.entrySet()) {
            System.out.println(k.getKey() + "-" + k.getValue());
        }
    }
}
