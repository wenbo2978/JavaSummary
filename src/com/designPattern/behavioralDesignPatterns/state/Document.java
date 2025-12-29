package com.designPattern.behavioralDesignPatterns.state;

public class Document {
    private DocumentState doc = new Draft();

    public DocumentState getDoc() {
        return doc;
    }

    public void setDoc(DocumentState doc) {
        this.doc = doc;
    }

    public void publish(){
        doc.publish(this);
    }
}
