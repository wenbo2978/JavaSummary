package com.leetcode.dynamicPropramPractice.leetcode0416;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        if(sum % 2 != 0)
            return false;

        int subSum = sum / 2;
        boolean[][] dp = new boolean[subSum + 1][nums.length + 1];
        for(int i = 0; i < nums.length + 1; i ++){
            dp[0][i] = true;
        }
        for(int i = 1; i <= subSum; i ++){
            for(int j = 1; j <= nums.length; j ++){
                if(nums[j - 1] > i){
                    dp[i][j] = dp[i][j - 1];
                }else{
                    dp[i][j] = dp[i - nums[j - 1]][j - 1] || dp[i][j - 1];
                }
            }
        }
        return dp[subSum][nums.length];
    }
}
