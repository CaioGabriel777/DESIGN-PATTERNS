package com.designpatterns.bridge.report;

import com.designpatterns.bridge.document.DocumentFormat;

// Refined Abstractions
public class DailyReport extends Report {

    public DailyReport(DocumentFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        format.renderHeader("Daily Standup Report");
        format.renderBody("Today we fixed 5 bugs and deployed the new API.");
    }
}
