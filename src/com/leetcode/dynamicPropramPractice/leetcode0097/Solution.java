package com.leetcode.dynamicPropramPractice.leetcode0097;

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if(len1 + len2 != len3)
            return false;
        if(len1 == 0 && len2 == 0 && len3 == 0)
            return true;
        if(len1 == 0)
            return s2.equals(s3);
        if(len2 == 0)
            return s1.equals(s3);
        boolean[][] path = new boolean[len1 + 1][len2 + 1];
        path[0][0] = true;

        for(int i = 1; i < len1 + 1; i ++){
            if(s1.charAt(i - 1) == s3.charAt(i - 1) && path[i - 1][0] == true)
                path[i][0] = true;
        }

        for(int i = 1; i < len2 + 1; i ++){
            if(s2.charAt(i - 1) == s3.charAt(i - 1) && path[0][i - 1] == true)
                path[0][i] = true;
        }

        for(int i = 1; i < len1 + 1; i ++){
            for(int j = 1; j < len2 + 1; j ++){
                if(s1.charAt(i - 1) == s3.charAt(i + j - 1) && path[i - 1][j])
                    path[i][j] = true;
                if(s2.charAt(j - 1) == s3.charAt(i + j - 1) && path[i][j - 1])
                    path[i][j] = true;
            }
        }
        return path[len1][len2];

    }
}
