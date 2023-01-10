package com.razno;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(new int []{0,2,0,0,0,4,2,0,16,0,0,5});
    }

    public void moveZeroes (int [] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
