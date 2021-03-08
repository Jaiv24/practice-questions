package com.company;

public class sortedSquareArray {
    public int[] sortedSquaredArr(int[] array) {
        // Write your code here.
        int[] result = new int[array.length];
        int smallValueIdx=0;
        int largerValueIdx = array.length - 1;
        for (int i = array.length-1; i >= 0 ; i--) {
            int smallerValue = array[smallValueIdx];
            int largerValue = array[largerValueIdx];
            if (Math.abs(smallerValue) > Math.abs(largerValue)){
                result[i] = smallerValue * smallerValue;
                smallValueIdx ++;
            }
            else {
                result[i] = largerValue *largerValue;
                largerValueIdx--;
            }
        }
        return result;
    }
}
