package com.designpatterns.bridge.report;

import com.designpatterns.bridge.document.DocumentFormat;

public class MonthlyReport extends Report {

    public MonthlyReport(DocumentFormat format) {
        super(format);
    }

    @Override
    public void generate() {
        format.renderHeader("Monthly Financial Report");
        format.renderBody("Company revenue grew by 15% this month!");
    }
}
