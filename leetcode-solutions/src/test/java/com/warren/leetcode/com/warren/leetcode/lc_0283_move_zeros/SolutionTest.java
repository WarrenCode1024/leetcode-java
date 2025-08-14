package com.warren.leetcode.com.warren.leetcode.lc_0283_move_zeros;

import com.warren.leetcode.lc_0283_move_zeroes.Solution;
import org.junit.Test;

/**
 * @author
 * @desc
 * @date 2025/8/14 17:22
 */

public class SolutionTest {
    @Test
    public void testMoveZeros() {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
//        int[] nums = {0,0};
//        int[] nums = {2,1};
        // test
        solution.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
