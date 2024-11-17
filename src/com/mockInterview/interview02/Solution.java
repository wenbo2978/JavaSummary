package com.mockInterview.interview02;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String reverseString(String str){
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < strs.length; i ++){
            StringBuilder sbTmp = new StringBuilder(strs[i]);
            if(i > 0)
                sb.append(" ");
            sb.append(sbTmp.reverse());
        }
        return sb.toString();
    }

    public int firstUniqueCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, -1);
            }else{
                map.put(ch, i);
            }
        }
        int ans = str.length();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != -1){
                ans = Math.min(ans, entry.getValue());
            }
        }
        if(ans == str.length())
            return -1;
        return ans;
    }

    public void moveZeros(int[] nums){
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0){
                zeroCount ++;
            }else{
                nums[i - zeroCount] = nums[i];
            }
        }

        for(int i = nums.length - zeroCount - 1; i < nums.length; i ++){
            nums[i] = 0;
        }
    }

    static public void main(String[] args){
        String input = "Hello world";
        Solution solution = new Solution();
        System.out.println(solution.reverseString(input));
        String input2 = "Hello";
        System.out.println(solution.reverseString(input2));
    }
}
