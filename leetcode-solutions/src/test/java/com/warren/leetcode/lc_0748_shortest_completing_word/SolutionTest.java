package com.warren.leetcode.lc_0748_shortest_completing_word;

import com.warren.leetcode.lc_0748_shortest_completing_word.Solution;
import org.junit.Test;

/**
 * @author
 * @desc
 * @date 2025/8/14 0:28
 */

public class SolutionTest {
    @Test
    public void testShortestCompletingWord(){
        Solution solution = new Solution();
        String licensePlate = "1s3 456";
        String[] words = {"looks","pest","stew","show"};
        System.out.println(solution.shortestCompletingWord(licensePlate, words));
    }
}
