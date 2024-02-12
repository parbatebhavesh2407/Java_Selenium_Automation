package ProgramTasks;

public class FirstRepeatingCharacterInString {
    public static void main(String[] args) {
        String w = "mumbai";
        char result = ' ';
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < w.length(); i++) {
            char temp = w.charAt(i);
            for (int j = 0; j < w.length(); j++) {
                if (w.charAt(j) == temp) {
                    if (j < index) {
                        index = j;
                        result = w.charAt(j);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
