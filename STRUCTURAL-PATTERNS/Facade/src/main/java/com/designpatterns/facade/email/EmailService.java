package com.designpatterns.facade.email;

// The Complex Subsystem Classes
// These classes have complex logic and dependencies
public class EmailService {

     public void createCompanyEmail(String name) {
        System.out.println("📧 Created email: " + name.toLowerCase() + "@org.com");
    }
}
