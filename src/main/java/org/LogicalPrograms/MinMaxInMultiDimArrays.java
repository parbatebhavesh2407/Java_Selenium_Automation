package org.LogicalPrograms;

public class MinMaxInMultiDimArrays {
    public static void main(String[] args) {
        int ary[][] = {{1, 3, 5}, {6, 8, 9}, {5, 3, 8}};
        int min = ary[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ary[i][j] < min) {
                    min = ary[i][j];
                }
            }
        }
        System.out.println("Min number in Multi-Dimensional Array is " + min);

        //for Max number
        int max = ary[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ary[i][j] > max) {
                    max = ary[i][j];
                }
            }
        }
        System.out.println("Max number in Multi-Dimensional Array is " + max);
    }
}