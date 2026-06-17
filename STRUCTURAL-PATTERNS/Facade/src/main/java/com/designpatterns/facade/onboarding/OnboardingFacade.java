package com.designpatterns.facade.onboarding;

import com.designpatterns.facade.database.DatabaseProfileManager;
import com.designpatterns.facade.email.EmailService;
import com.designpatterns.facade.vpn.VpnProvisioner;

// The Facade
// It hides the complexity and provides a simple, clean method.
public class OnboardingFacade {

    private final EmailService emailService;
    private final DatabaseProfileManager profileManager;
    private final VpnProvisioner vpnProvisioner;

    public OnboardingFacade() {
        this.emailService = new EmailService();
        this.profileManager = new DatabaseProfileManager();
        this.vpnProvisioner = new VpnProvisioner();
    }

    // This is the simplified interface!
    public void onboardNewEmployee(String name) {
        System.out.println("🚀 Starting onboarding process for: " + name);
        emailService.createCompanyEmail(name);
        profileManager.createProfile(name);
        vpnProvisioner.generateCertificate(name);
        System.out.println("✅ Onboarding complete!\n");
    }
}
