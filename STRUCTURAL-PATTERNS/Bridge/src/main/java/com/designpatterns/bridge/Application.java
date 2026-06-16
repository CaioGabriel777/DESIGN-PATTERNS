package com.designpatterns.bridge;

import com.designpatterns.bridge.document.HtmlFormat;
import com.designpatterns.bridge.document.PdfFormat;
import com.designpatterns.bridge.report.DailyReport;
import com.designpatterns.bridge.report.MonthlyReport;
import com.designpatterns.bridge.report.Report;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// We want a Daily Report in HTML
		Report dailyHtml = new DailyReport(new HtmlFormat());
		dailyHtml.generate();

		System.out.println("-------------------------");

		// We want a Monthly Report in
		Report monthlyPdf = new MonthlyReport(new PdfFormat());
		monthlyPdf.generate();
	}

}
