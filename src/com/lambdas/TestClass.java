package com.lambdas;

public class TestClass {

    public static void main(String[] args){
        CustomerInterface cInterface = (str, x) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < x; i ++){
                sb.append(str);
            }
            System.out.println(sb);
        };
        cInterface.buildString("hello", 6);
    }
}
