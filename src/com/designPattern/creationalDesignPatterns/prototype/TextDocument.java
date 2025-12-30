package com.designPattern.creationalDesignPatterns.prototype;

public class TextDocument implements Prototype<TextDocument>{

    private String text;
    private MetaData metadata;

    public TextDocument(String text, MetaData metadata) {
        this.text = text;
        this.metadata = metadata;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    @Override
    public TextDocument copy() {
        return new TextDocument(this.text, new MetaData(this.metadata.getAuthor()));
    }

    @Override
    public String toString() {
        return "TextDocument{" +
                "text='" + text + '\'' +
                ", metadata=" + metadata +
                '}';
    }
}
