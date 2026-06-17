package com.designpatterns.decorator.document.upload;

// The Component Interface
// This is the common interface for both the core object and the decorators.
public interface DocumentUploader {
    void upload(String fileName);
}
