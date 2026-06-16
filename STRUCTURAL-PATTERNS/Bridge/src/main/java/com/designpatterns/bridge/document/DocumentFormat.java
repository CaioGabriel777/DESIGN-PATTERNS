package com.designpatterns.bridge.document;

// The Implementation Hierarchy
// This interface defines how the report is rendered.
public interface DocumentFormat {

    void renderHeader(String text);
    void renderBody(String text);
}
