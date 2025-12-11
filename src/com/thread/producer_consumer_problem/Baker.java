package com.thread.producer_consumer_problem;

import java.util.ArrayDeque;

public class Baker {

    final ArrayDeque<Cookie> cookies = Main.cookies;

    public void produce(Cookie cookie) throws InterruptedException{
        synchronized (cookies){
            while(cookies.size() == Main.MAX_COOKIES){
                System.out.println("Barker waits!");
                cookies.wait();
            }

            cookies.add(cookie);
            System.out.println("Barker baked a cookie!\n" + cookies.size());

            cookies.notify();
        }
    }
}
