package org.LogicalPrograms;

import java.util.ArrayList;

public class UniqueNumberInArrays {
    public static void main(String[] args) {
        int ary1[] = {1, 2, 3, 3, 3, 3, 4,4,4, 5, 5, 5, 6, 6, 6, 1, 1, 2, 2, 7};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < ary1.length; i++) {
            int k = 0;
            if (!al.contains(ary1[i])) {
                al.add(ary1[i]);
                k++;
                for (int j = i + 1; j < ary1.length; j++) {
                    if (ary1[i] == ary1[j]) {
                        k++;
                    }
                }
                System.out.println(ary1[i] + "-" + k);
                if (k == 1) {
                    System.out.println(ary1[i] + " is Unique Number");
                }
            }
        }
    }
}
