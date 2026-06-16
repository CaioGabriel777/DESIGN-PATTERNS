package com.designpatterns.bridge.document;

public class HtmlFormat implements DocumentFormat {

    @Override
    public void renderHeader(String text) {
        System.out.println("<h1>" + text + "</h1>");
    }

    @Override
    public void renderBody(String text) {
        System.out.println("<p>" + text + "</p>");
    }
}
