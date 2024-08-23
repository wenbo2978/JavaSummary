package com.leetcode.dynamicPropramPractice.leetcode1140;

public class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] suffix = new int[n];
        int[][] dp = new int[n][n + 1];
        suffix[n - 1] = piles[n - 1];
        for(int i = n - 2; i >= 0; i --){
            suffix[i] = suffix[i + 1] + piles[i];
        }
        /*
        dp[i][j] means start from index i, m = j, the maximum stones Alice can get
        if 2 * j >= rest number of piles
            dp[i][j] = suffix[i]
        else
            dp[i][j] = max(dp[i][j], suffix[i] - dp[i + ?][])
         */
        for(int i = n - 1; i >= 0; i --){
            for(int m = 1; m <= n; m ++){
                if(i + 2 * m >= n){
                    dp[i][m] = suffix[i];
                }else{
                    for(int x = 1; x <= 2 * m; x ++){
                        dp[i][m] = Math.max(dp[i][m], suffix[i] - dp[i + x][Math.max(x, m)]);
                    }
                }
            }
        }
        return dp[0][1];
    }

    public static void main(String[] args){
        int[] piles = {2,7,9,4,4};
        Solution solution = new Solution();
        int res = solution.stoneGameII(piles);
        System.out.println(res);
    }
}
