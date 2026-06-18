package com.designpatterns.proxy.storage.oci;

import com.designpatterns.proxy.storage.DocumentStorage;

// The Real Subject
// This is the heavy, expensive object that connects to the cloud.
public class OciRealStorage implements DocumentStorage {

    public OciRealStorage() {
        System.out.println("⌛ Initializing connection to the Oracle Cloud Infrastructure (OCI)...");
    }

    @Override
    public String downloadDocument(String documentId, String userRole) {
        System.out.println("☁️ [NETWORK CALL] Fetching '" + documentId + "' from OCI buckets...");
        return "PDF_DATA_FOR_" + documentId;
    }
}
