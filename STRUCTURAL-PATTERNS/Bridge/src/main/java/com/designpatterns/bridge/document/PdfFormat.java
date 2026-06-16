package com.designpatterns.bridge.document;

public class PdfFormat  implements DocumentFormat {

    @Override
    public void renderHeader(String text) {
        System.out.println("PDF HEADER -> " + text);
    }

    @Override
    public void renderBody(String text) {
        System.out.println("PDF BODY -> " + text);
    }
}
