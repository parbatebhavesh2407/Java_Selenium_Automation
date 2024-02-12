package org.LogicalPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int no = 56789;
        int reverse = 0;
        while (no != 0) {
            int digit = no % 10;
            reverse = digit + reverse * 10;
            no = no / 10;
        }
        System.out.println(reverse);

    }
}
