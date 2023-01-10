package com.razno;

import java.util.Arrays;

public class Solution_2 {
    public static void main(String[] args) {
        Solution_2 sol2 = new Solution_2();
        sol2.sumOfUnique(new int[]{1,2,3,3,3,5});
    }

    public int mySumOfUnique(int[] nums) {
        int[] counter = new int[6];
        int sum = 0;
        for (int x : nums) {
            counter[x]++;


        }
        return sum;
    }

    public int sumOfUnique(int[] nums) {
        // create a new array to hold frequency of each number
        int[] counter = new int[6];
        int sum = 0;
        System.out.println("Sum is: " + sum);
        for (int num : nums) {
            counter[num]++;        // increment count of each num
            System.out.println("Counter array is: "+Arrays.toString(counter));
            if (counter[num] == 1)    // for count == 1, we know its first interaction
                sum += num;             // and we add it to sum. We are adding potential
            System.out.println("Counter array is: "+Arrays.toString(counter));
            System.out.println("Sum is (when += x): " + sum);
            // future duplicates as well

            if (counter[num] == 2)    // for count == 2, we know its a duplicate
                sum -= num;            // and we subtract it (Revert of first step for duplicate).
            System.out.println("Counter array is: "+Arrays.toString(counter));
            System.out.println("Sum is: (when -= x)" + sum);
            // Now it doesn't affect if count increases to 3,4,5...
        }
        System.out.println(sum);
        return sum;
    }
}
