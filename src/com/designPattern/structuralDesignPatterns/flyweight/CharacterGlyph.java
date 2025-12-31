package com.designPattern.structuralDesignPatterns.flyweight;

public class CharacterGlyph implements CharacterFlyweight{

    private final char character;
    private final String font;
    private final int size;

    public CharacterGlyph(char character, String font, int size) {
        this.character = character;
        this.font = font;
        this.size = size;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(
                "Draw '" + character + "' at (" + x + "," + y +
                        ") with font=" + font + ", size=" + size
        );
    }
}
