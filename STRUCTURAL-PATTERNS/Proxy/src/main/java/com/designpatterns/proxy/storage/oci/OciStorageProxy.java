package com.designpatterns.proxy.storage.oci;

import com.designpatterns.proxy.storage.DocumentStorage;

import java.util.HashMap;
import java.util.Map;

// The Proxy
// It wraps the Real Subject and adds Access Control and Caching.
public class OciStorageProxy implements DocumentStorage {

    private OciRealStorage realStorage; // The proxy holds a reference to the real object.
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String downloadDocument(String documentId, String userRole) {

        // Step 1: Protection Proxy Logic
        if (!userRole.equals("ADMIN")) {
            System.out.println("❌ [SECURITY REJECTED] Access denied to document: " + documentId);
            return null;
        }

        // Step 2: Cache Proxy Logic
        if (cache.containsKey(documentId)) {
            System.out.println("⚡ [CACHE HIT] Returning '" + documentId + "' directly from memory.");
            return cache.get(documentId);
        }

        // Step 3: Lazy Initialization
        // We only create the real connection if we survive the checks!
        if (realStorage == null) {
            realStorage = new OciRealStorage();
        }

        // Step 4: Delegate to the real object and cache the result
        String document = realStorage.downloadDocument(documentId, userRole);
        cache.put(documentId, document);

        return document;
    }
}
