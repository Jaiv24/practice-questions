package com.company;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int i : nums) {
            if (hashset.contains(i)) {
                return true;
            }
            hashset.add(i);

        }
        return false;
    }
}
