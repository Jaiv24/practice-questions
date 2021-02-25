// O(n) time complexity | O(1) space complexity

package com.company;
import java.util.*;
public class moveElementsToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int startPoint =0;
        int endPoint = array.size() - 1;
        while (startPoint < endPoint){
            if(array.get(startPoint) == toMove && array.get(endPoint)==toMove){
                endPoint--;
            }
            else if(array.get(startPoint) == toMove && array.get(endPoint) != toMove){
                swap(startPoint,endPoint,array);
                startPoint++;
                endPoint--;

            }
            else if(array.get(startPoint) != toMove){
                startPoint++;
            }
        }
        return array;
    }

    public static void swap(int startPoint, int endPoint, List<Integer> arr){
        int temp = arr.get(endPoint);
        arr.set(endPoint, arr.get(startPoint));
        arr.set(startPoint, temp);
    }
}
