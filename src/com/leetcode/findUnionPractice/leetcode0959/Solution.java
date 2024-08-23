package com.leetcode.findUnionPractice.leetcode0959;

class Solution {
    int[] father;
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        father = new int[(n + 1) * (n + 1)];
        for(int i = 0; i <= n; i ++){
            for(int j = 0; j <= n; j ++){
                if(i == 0 || i == n || j == 0 || j == n){
                    father[i * (n + 1) + j] = 0;
                }else{
                    father[i * (n + 1) + j] = i * (n + 1) + j;
                }
            }
        }
        int count = 1;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                char ch = grid[i].charAt(j);
                if(ch == ' ')
                    continue;
                int a = 0, b = 0;
                if(ch == '/'){
                    a = i * (n + 1) + j + 1;
                    b = (i + 1) * (n + 1) + j;
                }else if(ch == '\\'){
                    a = i * (n + 1) + j;
                    b = (i + 1) * (n + 1) + j + 1;
                }
                if(find(a) != find(b)){
                    union(a, b);
                }else{
                    //System.out.println(i + ", " + j);
                    count ++;
                }
            }
        }
        return count;
    }

    private int find(int x){
        if(father[x] != x){
            father[x] = find(father[x]);
        }
        return father[x];
    }

    private void union(int a, int b){
        int x = find(a);
        int y = find(b);
        if(x < y){
            father[y] = x;
        }else{
            father[x] = y;
        }

    }

}
