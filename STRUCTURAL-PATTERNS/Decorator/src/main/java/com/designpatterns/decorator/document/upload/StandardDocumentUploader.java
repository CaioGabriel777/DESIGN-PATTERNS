package com.designpatterns.decorator.document.upload;

// The Concrete Component
// This is the core logic: it just saves the file.
public class StandardDocumentUploader implements DocumentUploader {

    @Override
    public void upload(String fileName) {
        System.out.println("💾 Saving document '" + fileName + "' to the ORG servers...");
    }
}
