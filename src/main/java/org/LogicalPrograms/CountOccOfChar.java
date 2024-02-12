package org.LogicalPrograms;

public class CountOccOfChar {
    public static void main(String[] args) {
        int count = countOcc("TestAutomationTestJavaTest", 't');
        System.out.println(count);
    }

    private static int countOcc(String word, char character) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
