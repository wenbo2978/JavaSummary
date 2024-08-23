package com.leetcode.dynamicPropramPractice.leetcode1937;

public class Solution {
    public long maxPoints(int[][] points) {
        int row = points.length;
        int col = points[0].length;
        //define the dp array
        long[] dp = new long[col];

        for(int i = 0; i < row; i ++){

            //init dp[j] pick up value from col j, no cost
            for(int j = 0; j < col; j ++){
                dp[j] += points[i][j];
            }

            //update from left to right
            for(int j = 1; j < col; j ++){
                //if pick up value form left, pay the cost;
                dp[j] = Math.max(dp[j - 1] - 1, dp[j]);
            }

            //update from right to left
            for(int j = col - 2; j >= 0; j --){
                dp[j] = Math.max(dp[j + 1] - 1, dp[j]);
            }
        }
        long ans = 0;
        for(int i = 0; i < col; i ++){
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] input = {{1,3,4}, {4,6,3}, {5,3,2}};
        long ans = solution.maxPoints(input);
        System.out.println(ans);
    }
}
