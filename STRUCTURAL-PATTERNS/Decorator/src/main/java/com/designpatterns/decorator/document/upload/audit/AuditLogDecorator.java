package com.designpatterns.decorator.document.upload.audit;

import com.designpatterns.decorator.document.upload.DocumentUploader;
import com.designpatterns.decorator.document.upload.UploadDecorator;

public class AuditLogDecorator extends UploadDecorator {

    public AuditLogDecorator(DocumentUploader wrappedUploader) {
        super(wrappedUploader);
    }

    @Override
    public void upload(String fileName) {
        super.upload(fileName); // Let the upload happen first
        System.out.println("📋 [Audit] Logging upload event in the government tracking system.");
    }
}
