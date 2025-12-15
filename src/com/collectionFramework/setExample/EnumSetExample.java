package com.collectionFramework.setExample;

import com.util.utilEnum.Monster;

import java.util.EnumSet;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<Monster> enumSet = EnumSet.of(Monster.BOSS);
        enumSet.add(Monster.EASY);
        System.out.println(enumSet.contains(Monster.HARD));
        System.out.println(enumSet.contains(Monster.EASY));
    }
}
