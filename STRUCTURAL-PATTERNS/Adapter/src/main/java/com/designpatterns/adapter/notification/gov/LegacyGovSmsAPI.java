package com.designpatterns.adapter.notification.gov;

// The Adaptee
// This is the legacy or third-party system. It is incompatible.
public class LegacyGovSmsAPI {

    public void dispatchShortMessage(int phonePrefix, String phoneNumber, String text) {
        System.out.println("Sending legacy SMS to +" + phonePrefix + phoneNumber + ": " + text);
    }
}
