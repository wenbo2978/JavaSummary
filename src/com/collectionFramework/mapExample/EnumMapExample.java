package com.collectionFramework.mapExample;

import com.util.utilEnum.Monster;

import java.util.EnumMap;

public class EnumMapExample {

    public static void main(String[] args) {
        EnumMap<Monster, Integer> score = new EnumMap<>(Monster.class);
        score.put(Monster.BOSS, 10);
        score.put(Monster.EASY, 1);
        System.out.println(score.get(Monster.BOSS));
    }
}
