package com.leetcode.stackPractice.leetode0962;

import java.util.Stack;

class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i]){
                stack.push(i);
            }
        }

        int ans = 0;

        for(int j = n - 1; j >= 0; j --){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[j]){
                ans = Math.max(ans, j - stack.pop());
            }
        }
        return ans;
    }
}