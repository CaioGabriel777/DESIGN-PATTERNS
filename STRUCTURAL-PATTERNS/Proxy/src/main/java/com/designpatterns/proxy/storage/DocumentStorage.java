package com.designpatterns.proxy.storage;

// The Subject Interface
// Both the Real Object and the Proxy will implement this.
public interface DocumentStorage {
    String downloadDocument(String documentId, String userRole);
}
