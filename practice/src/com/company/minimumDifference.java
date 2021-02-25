package com.company;
import java.util.*;

public class minimumDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne=0, idxTwo=0;
        int smallest = Integer.MAX_VALUE;
        int curr = Integer.MAX_VALUE;
        int [] smallestPair = new int[2];
        while (idxOne < arrayOne.length && idxTwo<arrayTwo.length){
            int firstNum =arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if (firstNum < secondNum){
                curr = secondNum - firstNum;
                idxOne++;
            }
            else if(secondNum < firstNum){
                curr = firstNum -secondNum;
                idxTwo++;
            }
            else {
                return new int[] {firstNum, secondNum};
            }

            if (smallest > curr){
                smallest = curr;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
