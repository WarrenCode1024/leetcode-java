package com.warren.leetcode.lc_0015_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @desc 15. 三数之和
 * @date 2025/8/14 20:27
 */

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);  // 排序

        for (int i = 0; i < n - 2; i++) {
            // 跳过重复的 i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 跳过重复的 left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // 跳过重复的 right
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
