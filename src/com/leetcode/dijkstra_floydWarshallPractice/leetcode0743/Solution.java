package com.leetcode.dijkstra_floydWarshallPractice.leetcode0743;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] path = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];
        for(int i = 0; i < n + 1; i ++){
            for(int j = 0; j < n + 1; j ++){
                path[i][j] = -1;
            }
            path[i][i] = 0;
        }
        for(int i = 0; i < times.length; i ++){
            int a = times[i][0];
            int b = times[i][1];
            int w = times[i][2];
            path[a][b] = w;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for(int i = 1; i < n + 1; i ++){
            if(path[k][i] != -1)
                pq.add(new int[]{i, path[k][i]});
        }
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int t = cur[1];
            int node = cur[0];
            if(visited[node] == 1)
                continue;
            visited[node] = 1;
            for(int i = 1; i <= n; i ++){
                if(path[node][i] != -1){
                    if((path[k][i] > path[k][node] + path[node][i]) || path[k][i] == -1){
                        path[k][i] = path[k][node] + path[node][i];
                        pq.add(new int[]{i, path[k][i]});
                        //System.out.println(path[k][i]);
                    }
                }

            }
        }
        int dist = 0;
        int flag = 0;
        for(int i = 1; i < n + 1; i ++){
            if(i != k)
                dist = Math.max(dist, path[k][i]);
            if(path[k][i] == -1)
                flag = 1;
        }
        return flag == 1 ? -1 : dist;
    }
}
