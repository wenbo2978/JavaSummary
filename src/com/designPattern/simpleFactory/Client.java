package com.designPattern.simpleFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TV tv;
        //String brand = new String();
        Scanner in = new Scanner(System.in);
        String brand = in.next();
        System.out.println(brand);
        tv = TVFactory.produceTV(brand);
        if(tv!=null)
            tv.play();
    }
}
