package com.mockInterview.palindrome;

public class MakeAllSubStringPalindromeSolution {

    public static long totalCost(String s){
        int n = s.length();
        int P = n + 1;
        long[] cnt1 = new long[26];
        int mask = 0;
//        for(int b = 0; b < 26; b ++){
//            if(((mask >>> b) & 1) != 0){
//                cnt1[b] ++;
//            }
//        }
        for(int i = 0; i < n; i ++){
            int bit = s.charAt(i) - 'a';
            mask ^= (1 << bit);
            for(int b = 0; b < 26; b ++){
                if(((mask >>> b) & 1) != 0){
                    cnt1[b] ++;
                }
            }
        }

        long A = 0;
        for(int b = 0; b < 26; b ++){
            long ones = cnt1[b];
            long zeros = P - ones;
            A += ones * zeros;
        }

        long evenPrefixes = (n / 2) + 1;
        long oddPrefixes = P - evenPrefixes;
        long B = evenPrefixes * oddPrefixes;

        return (A - B) / 2;
    }
}
