package com.designPattern.factoryMethod;

public class Client {
    public static void main(String[] args) {
        TV tv;
        TVFactory tvFactory = new HaierTVFactory();
        //String brand = new String();
        /*Scanner in = new Scanner(System.in);
        String brand = in.next();*/

        tv = tvFactory.produceTV();
        if(tv!=null)
            tv.play();
    }
}
