package com.company;

public class numOfWaysToMakeChange {

    // time O(nd) | space O(n)
    public static int numberOfWaysToMakeChange(int n, int[] denoms){
        int[] ways = new int[n+1];
        ways[0] = 1;
        for (int demon:denoms){
            for (int amount =1 ; amount<n+1; amount++ ){
                if (demon <= amount){
                    ways[amount] += ways[amount - demon];
                }
            }
        }
        return ways[n];
    }
}

