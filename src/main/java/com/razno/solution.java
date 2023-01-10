package com.razno;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.twoOutOfThree(new int[]{2, 4, 1},new int[]{2, 3},new int[]{1, 4});
    }
    public List<Integer> twoOutOfThree (int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>(), set = new HashSet<>();
        for (int i: nums1) { set1.add(i); set.add(i); }
        for (int i: nums2) { set2.add(i); set.add(i); }
        for (int i: nums3) { set3.add(i); set.add(i); }
        List<Integer> result = new ArrayList<>();
        for (int i: set) {
            if (set1.contains(i) && set2.contains(i) || set1.contains(i) && set3.contains(i) || set2.contains(i) && set3.contains(i)) {
                result.add(i);
            }
        }
        System.out.println(result.toString());
        return result;
    }

}

