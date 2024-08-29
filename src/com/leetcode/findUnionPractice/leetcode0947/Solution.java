package com.leetcode.findUnionPractice.leetcode0947;

class Solution {
    int group = 0;
    public int removeStones(int[][] stones) {
        int[] parents = new int[20003];
        for(int[] e : stones){
            unionFind(e[0] + 1, e[1] + 10002, parents);
        }
        return stones.length - this.group;
    }

    private void unionFind(int a, int b, int[] parents){
        int pa = findParents(a, parents);
        int pb = findParents(b, parents);
        if(pa != pb){
            parents[pb] = pa;
            this.group --;
        }
    }

    private int findParents(int a, int[] parents){
        if(parents[a] == 0){
            this.group ++;
            parents[a] = a;
            return a;
        }
        int par = parents[a];
        if(par != a){
            return findParents(par, parents);
        }
        return par;
    }

}

/**

 */
