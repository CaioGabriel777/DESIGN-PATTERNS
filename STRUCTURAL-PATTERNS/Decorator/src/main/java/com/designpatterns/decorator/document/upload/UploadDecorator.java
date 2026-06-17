package com.designpatterns.decorator.document.upload;

// The Base Decorator
// It implements the interface and holds a reference to a wrapped object.
public class UploadDecorator implements DocumentUploader {

    protected DocumentUploader wrappedUploader;

    public UploadDecorator(DocumentUploader wrappedUploader) {
        this.wrappedUploader = wrappedUploader;
    }

    @Override
    public void upload(String fileName) {
        // Delegates the work to the wrapped object.
        wrappedUploader.upload(fileName);
    }
}
