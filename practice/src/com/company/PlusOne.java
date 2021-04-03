package com.company;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;
        while (i >=0 && digits[i] == 9) {
            i --;
        }
        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        // If it's find to modify int[] digits, then can only modify digit at index i
        // This will save lots of unnecessary operation.
        int[] result = new int[digits.length];
        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = {1,2,3};
        System.out.println(Arrays.toString(plusOne(x)));
    }
}
