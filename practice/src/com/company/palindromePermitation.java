package com.company;

public class palindromePermitation {
    public boolean canPermutePalindrome(String s) {
        int[] char_counts = new int[128];
        for (int i = 0; i <s.length(); i++){
            char_counts[s.charAt(i)]++;
        }
        int count =0;
        for (int i = 0; i < 128; i++) {
            count += char_counts[i] % 2;
        }
        return count <= 1;
    }
}
