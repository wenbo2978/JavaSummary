package com.mockInterview.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}
