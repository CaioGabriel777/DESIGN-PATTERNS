package com.designpatterns.decorator.document.upload.security;

import com.designpatterns.decorator.document.upload.DocumentUploader;
import com.designpatterns.decorator.document.upload.UploadDecorator;

// Concrete Decorators
// These add the specific new behaviors
public class VirusScanDecorator extends UploadDecorator {

    public VirusScanDecorator(DocumentUploader wrappedUploader) {
        super(wrappedUploader);
    }

    @Override
    public void upload(String fileName) {
        System.out.println("🛡️ [Security] Scanning '" + fileName + "' for viruses...");
        super.upload(fileName); // Pass it down the chain
    }
}
