package com.company;

import java.util.Arrays;

public class singleNumber {
    static int singlNumber(int[] nums) {
        int a=0;
        for (int i : nums){
            a ^= i; // ^= is XOR gate representation a(XOR)0=a and a(XOR)a=0
        }
        return a;
    }

    public static void main(String[] args) {
        int[] x = {4,2,1,2,1};
        System.out.println(singlNumber(x));
    }
}
