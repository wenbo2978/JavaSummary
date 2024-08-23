package com.leetcode.bfs_dfs_Practice.leetcode1466;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> road = new ArrayList<>();
        int[] rd = new int[n];
        rd[0] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        for(int i = 0; i < n; i ++){
            road.add(new ArrayList<int[]>());
        }
        for(int i = 0; i < connections.length; i ++){
            int a = connections[i][0];
            int b = connections[i][1];
            if(b == 0){
                rd[a] = 1;
                queue.offer(a);
            }
            road.get(a).add(new int[]{a, b});
            road.get(b).add(new int[]{a, b});
        }
        int count = 0;
        while(!queue.isEmpty()){
            int t = queue.size();
            while(t > 0){
                int k = queue.peek();
                queue.poll();
                for(int i = 0; i < road.get(k).size(); i ++){
                    int st = road.get(k).get(i)[0];
                    int ed = road.get(k).get(i)[1];
                    if(st == k){
                        if(rd[ed] == 0){
                            queue.offer(ed);
                            rd[ed] = 1;
                            count ++;
                        }
                    }else{
                        if(rd[st] == 0){
                            queue.offer(st);
                            rd[st] = 1;
                        }
                    }
                }
                t --;
            }
        }
        return count;
    }

    public static void main(String[] args){

    }
}
