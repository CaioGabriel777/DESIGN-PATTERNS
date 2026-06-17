package com.designpatterns.decorator;

import com.designpatterns.decorator.document.upload.DocumentUploader;
import com.designpatterns.decorator.document.upload.StandardDocumentUploader;
import com.designpatterns.decorator.document.upload.audit.AuditLogDecorator;
import com.designpatterns.decorator.document.upload.security.VirusScanDecorator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String file = "ferias_2026.pdf";

		// Scenario 1: A simple upload
		System.out.println("--- Standard Upload ---");
		DocumentUploader standardUploader = new StandardDocumentUploader();
		standardUploader.upload(file);

		// Scenario 2: Wrapping the request with security and logging
		System.out.println("\n--- Secure & Audited Upload ---");
		DocumentUploader secureUploader = new AuditLogDecorator(new VirusScanDecorator(new StandardDocumentUploader()));

		// When we call the method, it executes the entire chain!
		secureUploader.upload(file);
	}

}
