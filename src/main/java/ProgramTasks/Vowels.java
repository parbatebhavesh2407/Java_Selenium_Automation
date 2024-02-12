package ProgramTasks;

import java.lang.reflect.Array;
import java.util.Locale;

public class Vowels {
    public static void main(String[] args) {
        String d = "Aeroplane";
        d = d.toLowerCase();
        int count = 0;
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == 'a' || d.charAt(i) == 'e' || d.charAt(i) == 'i' || d.charAt(i) == 'o' || d.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total Count of Vowel :" + count);
    }
}
