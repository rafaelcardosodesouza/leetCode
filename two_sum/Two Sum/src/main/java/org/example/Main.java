package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        Solution solution = new Solution();
        System.out.println("" + Arrays.toString(solution.twoSum(nums, target)));

    }

}