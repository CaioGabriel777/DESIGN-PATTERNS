package com.designpatterns.adapter.notification.gov;

import com.designpatterns.adapter.notification.NotificationService;

// The Adapter
// It implements the target interface, but wraps the Adaptee inside.
public class GovSmsAdapter implements NotificationService {

    private final LegacyGovSmsAPI legacyGovSmsAPI;

    // We inject the legacy API into the adapter
    public GovSmsAdapter(LegacyGovSmsAPI legacyGovSmsAPI) {
        this.legacyGovSmsAPI = legacyGovSmsAPI;
    }

    @Override
    public void send(String userEmail, String message) {

        // Here we translate the modern request into the legacy format.
        // In a real scenario, we might look up the phone number using the email.

        System.out.println("Adapter: Translating email " + userEmail + " to phone number...");
        int defaultPrefix = 55;
        String mockPhone = "71999999999";

        // We call the incompatible method using the translated data.
        legacyGovSmsAPI.dispatchShortMessage(defaultPrefix, mockPhone, message);
    }
}
