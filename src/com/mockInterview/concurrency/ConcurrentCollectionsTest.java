package com.mockInterview.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionsTest {

    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void addItem(String key, Integer val){
        map.put(key, val);
    }

    public Integer getItem(String key){
        return map.get(key);
    }
}
