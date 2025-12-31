package com.designPattern.structuralDesignPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<String, CharacterGlyph> cache = new HashMap<>();

    public static CharacterGlyph get(char c, String font, int size){
        String key = c + font + size;
        return cache.computeIfAbsent(key,
                k -> new CharacterGlyph(c, font, size));
    }
}
