package com.company;

import java.util.Arrays;

public class stringsPermutation {

    static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    static boolean permutation(String a, String b){
        String c = a.replace(" ", "");
        if (c.length() == b.length()){
            return sort(c).equals(sort(b));
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(permutation("abc. ","bca"));
    }
}

