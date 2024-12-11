package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int faltante = target - nums[i];
            if (map.containsKey(faltante)) {
                return new int[]{map.get(faltante), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
