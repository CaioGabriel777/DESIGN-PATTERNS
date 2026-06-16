package com.designpatterns.bridge.report;

import com.designpatterns.bridge.document.DocumentFormat;

// The Abstraction Hierarchy
// This abstract class defines what the report is.
public abstract class Report {

    // This is the Bridge! We hold a reference to the implementation.
    protected final DocumentFormat format;

    public Report(DocumentFormat format) {
        this.format = format;
    }

    // Every report must know how to generate itself.
    public abstract void generate();
}
