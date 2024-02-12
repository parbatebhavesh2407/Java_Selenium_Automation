package org.LogicalPrograms;

public class ReverseWithoutReverseFunctionAndPalindrome {
    public static void main(String[] args) {
        String s = "madams";
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        if (t.equalsIgnoreCase(s)) {
            System.out.println("Given string : "+ s + " is Palindrome");
        } else {
            System.out.println("Given String : "+ s + " is Not Palindrome");
        }
    }


}
