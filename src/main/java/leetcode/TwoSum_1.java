package leetcode;

import com.razno.VesControl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 extends VesControl {
    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 3, 4, 5, 6, 14}, 16);
        myTwoSum(new int[]{1, 2, 3, 4, 5, 6, 11}, 16);
        removeElement(new int[]{0,1,2,2,3,0,4,2},2);
        search(new int []{-1,0,3,5,9,12}, 9);
        TwoSum_1 test1 = new TwoSum_1();
        test1.myTwoSum(new int [] {1,3,5,6,9,11}, 12);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                result[1] = i+1;
                result[0] = 1+(hashMap.get(target - numbers[i]));
                System.out.println(Arrays.toString(result));
                return result;
            }
            hashMap.put(numbers[i], i);
        }
        System.out.println("no right answer");
        return new int[]{-1, -1};
    }

    public static int[] myTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = (map.get(target - nums[i]));
                System.out.print(result[0]);
                System.out.print("("+ nums[map.get(target - nums[i])] + ")" + " ");
                System.out.print(result[1]);
                System.out.print("("+ nums[i] + ")" + " ");
                System.out.println("= " + target);
                return result;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solutions for input array");
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int echNum : nums
        ) {
            if (echNum != val) {
                nums[count++] = echNum;
            }
        }
        return count;
    }

    public static int search(int[] nums, int target) {  // by me
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            int mid = (tail + head) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                head = mid + 1;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            }

        }
        return -1;
    }

        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public int firstBadVersion(int n) {

        if (n <= 0 || !isBadVersion(n)) {
            return -1;
        }

        if (isBadVersion(1)) {
            return 1;
        }


        int head = 1;
        int tail = n;
        while (head < tail) {
            int mid = head + (tail - head) / 2;
            if (isBadVersion(mid)) {
                tail = mid;
            } else {
                head = mid + 1;
            }
        }

        return head;
    }

    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length-1;

        while (head <= tail) {
            int mid = (head+tail)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]){
                tail = mid - 1;
            } else {
                head = mid + 1;
            }

        }
        System.out.println(head);
        return head;
    }

}


