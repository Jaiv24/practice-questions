package com.company;

import java.util.*;

public class URLify {
    public char[] setToArray(List<Character> list){
        char[] result = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public char[] replaceSpaces(char[] str, int trueLength){
        List<Character> arrayList = new ArrayList<>();
        for (int i=0; i<trueLength; i++){
            if(str[i] == ' '){
                arrayList.add('%');
                arrayList.add('2');
                arrayList.add('0');
            }else {
                arrayList.add(str[i]);
            }
        }
        return setToArray(arrayList);
    }
}
