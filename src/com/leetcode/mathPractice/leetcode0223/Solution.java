package com.leetcode.mathPractice.leetcode0223;

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ay2 - ay1) * (ax2 - ax1);
        int area2 = (by2 - by1) * (bx2 - bx1);
        int len = 0;
        int height = 0;
        height = Math.min(by2, ay2) - Math.max(by1, ay1);
        len = Math.min(bx2, ax2) - Math.max(bx1, ax1);
        len = Math.max(0, len);
        height = Math.max(0, height);
        return area1 + area2 - len * height;
    }
}