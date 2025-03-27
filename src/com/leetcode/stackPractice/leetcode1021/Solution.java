package com.leetcode.stackPractice.leetcode1021;

import java.util.Stack;

public class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder("");
        Stack<Character> st = new Stack<>();
        Stack<Character> tmp = new Stack<>();
        int openNum = 0, closeNum = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                openNum ++;
            }else{
                st.push(ch);
                closeNum ++;

                if(closeNum == openNum && openNum > 0){
                    st.pop();
                    while(st.size() > 1){
                        char k = st.pop();
                        tmp.push(k);
                    }
                    st.pop();
                    while(tmp.size() > 0){
                        char k = tmp.pop();
                        sb.append(k);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String test = "(())(())((())())";
        System.out.println(solution.removeOuterParentheses(test));
    }
}
