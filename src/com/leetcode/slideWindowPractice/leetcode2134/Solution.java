package com.leetcode.slideWindowPractice.leetcode2134;

class Solution {
    public int minSwaps(int[] nums) {
        //count the number of 1
        int len = nums.length;
        int count = 0;
        for(int n : nums){
            if(n == 1)
                count++;
        }
        //count the ans of the first window
        int ans = 0;
        for(int i= 0; i < count; i ++){
            if(nums[i] == 0)
                ans ++;
        }
        //slide the window
        int tmp = ans;
        for(int i = 1; i < len; i ++){
            //check the previous value
            if(nums[i - 1] == 0)
                tmp --;
            //check the current value
            //left index = i
            if(nums[(i + count - 1)%len] == 0){
                tmp ++;
            }
            ans = Math.min(ans, tmp);
        }
        return ans;
    }
}
