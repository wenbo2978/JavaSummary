package com.leetcode.dynamicPropramPractice.leetcode0322;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int coinChange(int[] coins, int amount) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < coins.length; i ++){
            set.add(coins[i]);
        }
        int[] ans = new int[amount + 1];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        for(int i = 1; i < ans.length; i ++){
            if(set.contains(i)){
                ans[i] = 1;
            }else{
                int tmp = Integer.MAX_VALUE;
                for(int k = 1; k <= i / 2; k ++){
                    if(ans[i - k] != -1 && ans[k] != -1){
                        tmp = Math.min(tmp, ans[i - k] + ans[k]);
                    }
                }
                if(tmp != Integer.MAX_VALUE)
                    ans[i] = tmp;
            }
        }
        return ans[amount];
    }
}
