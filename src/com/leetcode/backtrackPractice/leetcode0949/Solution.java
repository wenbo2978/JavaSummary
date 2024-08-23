package com.leetcode.backtrackPractice.leetcode0949;

class Solution {
    int maxH = -1;
    int maxM = -1;
    public String largestTimeFromDigits(int[] arr) {
        backtrack(arr, 0);
        if(maxH == -1 && maxM == -1)
            return "";
        return String.format("%02d:%02d",maxH, maxM);
    }


    private void backtrack(int[] arr, int t){
        if(t == arr.length){
            int hour = arr[0] * 10 + arr[1];
            int mins = arr[2] * 10 + arr[3];
            if(hour <= 23 && mins <= 59){
                if((hour > maxH) || (hour == maxH && mins > maxM)){
                    maxH = hour;
                    maxM = mins;
                }
            }
        }else{
            for(int i = t; i < arr.length; i ++){
                swap(arr, t, i);
                if(t == 0){
                    if(arr[t] <= 2)
                        backtrack(arr, t + 1);
                }else if(t == 1){
                    if((arr[0] * 10 + arr[1]) < 24)
                        backtrack(arr, t + 1);
                }else if(t == 2){
                    if((arr[0] * 10 + arr[1]) < 24 && arr[2] < 6)
                        backtrack(arr, t + 1);
                }else{
                    backtrack(arr, t + 1);
                }

                swap(arr, t, i);

            }
        }
    }

    private void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args){

    }
}
