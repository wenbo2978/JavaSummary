package com.leetcode.slideWindowPractice.leetcode1930;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] left = new int[26];
        int[] right = new int[26];
        for(int i = 0; i < s.length(); i ++){
            right[s.charAt(i) - 'a'] ++;
        }
        //int count = 0;
        Set<String> set = new HashSet<>();
        right[s.charAt(0) - 'a'] --;
        for(int i = 1; i < s.length() - 1; i ++){
            char ch = s.charAt(i - 1);
            left[ch - 'a'] ++;
            char mid = s.charAt(i);
            right[mid - 'a'] --;
            for(int j = 0; j < 26; j ++){
                if(left[j] > 0 && right[j] > 0){
                    StringBuilder sb = new StringBuilder("");
                    sb.append((char)('a' + j));
                    sb.append(mid);
                    sb.append((char)('a' + j));
                    set.add(sb.toString());
                    //System.out.println(sb.toString());
                }
            }
            if(set.size() == 26 * 26)
                break;
        }
        return set.size();
    }
}
