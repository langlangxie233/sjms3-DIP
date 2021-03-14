package com.test;

public class Exchange {
    public static void main(String[] args) {
        XLSTransform trans = new XLSTransform();
        DatabaseSource data = new DatabaseSource();
        TextSource text = new TextSource();
        trans.To(data);
        trans.To(text);
    }
}
