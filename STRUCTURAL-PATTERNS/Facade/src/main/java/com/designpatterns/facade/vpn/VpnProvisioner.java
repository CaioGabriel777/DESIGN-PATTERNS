package com.designpatterns.facade.vpn;

public class VpnProvisioner {

    public void generateCertificate(String name) {
        System.out.println("🔐 Generated VPN certificate for " + name);
    }
}
