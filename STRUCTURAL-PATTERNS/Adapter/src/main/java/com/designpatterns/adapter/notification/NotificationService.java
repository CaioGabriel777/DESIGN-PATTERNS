package com.designpatterns.adapter.notification;

// The Target Interface
// This is what your modern system expects to use.
public interface NotificationService {
    void send(String userEmail, String message);
}
