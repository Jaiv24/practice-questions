package com.company;

import java.util.HashMap;

public class firstNotRepeatingCharacter {

    char firstNotRepeatingChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else{
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(charCount.get(c) == 1) return c;
        }
        return '_';
    }
}


