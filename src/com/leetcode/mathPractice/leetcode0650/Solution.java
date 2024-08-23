package com.leetcode.mathPractice.leetcode0650;

class Solution {
    public int minSteps(int n) {
        if(n == 1)
            return 0;
        int factor = findFactor(n);
        if(factor == 1)
            return n;
        return minSteps(n / factor) + factor;

    }

    private int findFactor(int n){
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0)
                return i;
        }
        return 1;
    }

}
