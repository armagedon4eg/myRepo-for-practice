package com.razno;

public class SquarsOfSorteedArray {


    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int head = 0;
        int tail = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[head]) > Math.abs(nums[tail])) {
                arr[i] = nums[head] * nums[head];
                head++;
            } else {
                arr[i] = nums[tail] * nums[tail];
                tail--;
            }
        }
        return arr;
    }


}

