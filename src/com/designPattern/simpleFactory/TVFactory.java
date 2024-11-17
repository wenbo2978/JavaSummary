package com.designPattern.simpleFactory;

public class TVFactory {

    public static TV produceTV(String brand){
        if(brand.equals("Haier")){
            System.out.println("produce Haier TV...");
            return new HaierTV();
        }else if(brand.equals("Hisense")){
            System.out.println("produce Hisense TV...");
            return new HisenseTV();
        }else{
            System.out.println("can't produce this brand...");
            return null;
        }

    }
}
