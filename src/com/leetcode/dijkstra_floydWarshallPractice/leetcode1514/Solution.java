package com.leetcode.dijkstra_floydWarshallPractice.leetcode1514;

import java.util.*;

public class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node){
        Map<Integer, Map<Integer, Double>> map = new HashMap<>();
        for(int i = 0; i < edges.length; i ++){
            int[] e = edges[i];
            map.computeIfAbsent(e[0], m -> new HashMap<Integer, Double>()).put(e[1], succProb[i]);
            map.computeIfAbsent(e[1], m -> new HashMap<Integer, Double>()).put(e[0], succProb[i]);
        }
        Queue<double[]> maxHeap = new PriorityQueue<>(Comparator.comparingDouble(a -> -a[0]));
        maxHeap.offer(new double[]{1, start_node});
        double[] ans = new double[n];
        while(!maxHeap.isEmpty()){
            double[] dis = maxHeap.poll();
            int v = (int)dis[1];
            if(v == end_node)
                return dis[0];
            if(dis[0] > ans[v]){
                ans[v] = dis[0];
                //for(Map.Entry<Integer, Double> entry : map.getOrDefault(v, Map.of()).entrySet())
                for(Map.Entry<Integer, Double> entry : map.getOrDefault(v, Collections.emptyMap()).entrySet()){
                    int node = entry.getKey();
                    double p = entry.getValue();
                    maxHeap.offer(new double[]{dis[0] * p, node});
                }
            }
        }
        return 0d;
    }

    public static void main(String[] args){
        int n = 3;
        int[][] edges = new int[][]{{0,1},{1,2},{0,2}};
        double[] succProb = new double[]{0.5,0.5,0.2};
        int start_node = 0;
        int end_node = 2;
        Solution solution = new Solution();
        double res = solution.maxProbability(n, edges, succProb, start_node, end_node);
        System.out.println(res);
    }
}
