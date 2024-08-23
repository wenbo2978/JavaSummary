package com.leetcode.bfs_dfs_Practice.leetcode1743;

import java.util.*;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        int len = adjacentPairs.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < len; i ++){
            int a = adjacentPairs[i][0];
            int b = adjacentPairs[i][1];
            if(map.get(a) == null){
                map.put(a, new ArrayList<Integer>());
            }
            map.get(a).add(b);
            if(map.get(b) == null){
                map.put(b, new ArrayList<Integer>());
            }
            map.get(b).add(a);
        }
        int left = 0;
        for(Map.Entry<Integer, List<Integer>> en : map.entrySet()){
            if(en.getValue().size() == 1){
                left = en.getKey();
                break;
            }
        }
        int[] ans = new int[len + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(left);
        int index = 0;
        Set<Integer> set = new HashSet<>();
        while(!queue.isEmpty()){
            int v = queue.poll();
            ans[index++] = v;
            set.add(v);
            List<Integer> list = map.get(v);
            for(int i = 0; i < list.size(); i ++){
                if(!set.contains(list.get(i))){
                    queue.offer(list.get(i));
                }
            }
        }
        return ans;
    }
}
