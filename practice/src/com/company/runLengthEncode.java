package com.company;

public class runLengthEncode {
    public String runLengthEncoding(String string) {
        // Write your code here.

        //check for null values
        if(string == null || string.length() ==0 ){
            return "";
        }
        StringBuilder result = new StringBuilder();
        char[] inputChar = string.toCharArray();
        char prevChar = 0;
        int counter = 0;
        for (char c: inputChar){
            if (c == prevChar){
                counter++;
            }
            else {
                result.append(counter).append(prevChar);
                prevChar =c;
                counter=1;
            }
        }
        result.append(counter).append(prevChar);

        return result.toString();
    }
}
