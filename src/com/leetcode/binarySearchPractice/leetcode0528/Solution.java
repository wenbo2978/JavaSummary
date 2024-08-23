package com.leetcode.binarySearchPractice.leetcode0528;

import java.util.Random;

class Solution {

    int[] sumArr;
    public Solution(int[] w) {
        this.sumArr = w;
        for(int i = 1; i < w.length; i ++){
            this.sumArr[i] += this.sumArr[i - 1];
        }
    }

    public int pickIndex() {
        Random random = new Random();
        int v = random.nextInt(sumArr[this.sumArr.length - 1]) + 1;
        int left = 0, right = this.sumArr.length - 1;
        //int md;
        //System.out.println(v);
        //int index = 0;
        while(left < right){
            /*if(index ++ > 100){
                break;
            }*/
            //System.out.println(left + ", " + right);
            int md = left + (right - left) / 2;
            if(this.sumArr[md] < v){
                left = md + 1;
            }else{
                right = md;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
